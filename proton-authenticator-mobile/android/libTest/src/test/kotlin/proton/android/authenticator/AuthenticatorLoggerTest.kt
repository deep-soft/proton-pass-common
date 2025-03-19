package proton.android.authenticator

import com.google.common.truth.Truth.assertThat
import org.junit.Test
import uniffi.proton_authenticator_common_mobile.AuthenticatorLogLevel
import uniffi.proton_authenticator_common_mobile.AuthenticatorLogger
import uniffi.proton_authenticator_common_mobile.emitLog
import uniffi.proton_authenticator_common_mobile.registerAuthenticatorLogger

class AuthenticatorLoggerTest {

    @Test
    fun `can register a logger`() {
        val loggedMessages = mutableListOf<Pair<AuthenticatorLogLevel, String>>()
        registerAuthenticatorLogger(object : AuthenticatorLogger {
            override fun log(level: AuthenticatorLogLevel, message: String) {
                loggedMessages.add(level to message)
            }
        })

        val messages = listOf(
            "trace message",
            "debug message",
            "info message",
            "warn message",
            "error message"
        )

        val levels = listOf(
            AuthenticatorLogLevel.TRACE,
            AuthenticatorLogLevel.DEBUG,
            AuthenticatorLogLevel.INFO,
            AuthenticatorLogLevel.WARN,
            AuthenticatorLogLevel.ERROR,
        )

        for ((message, level) in messages.zip(levels)) {
            emitLog(level, message)
        }

        assertThat(loggedMessages.size).isEqualTo(messages.size)

        for (i in messages.indices) {
            val loggedMessage = loggedMessages[i]
            assertThat(loggedMessage.first).isEqualTo(levels[i])
            assertThat(loggedMessage.second).isEqualTo(messages[i])
        }
    }

}