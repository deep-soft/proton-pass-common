## To be released

### Features :tada:

### Fixes :bug:

- authenticator: make TOTP issuer mandatory

### Other

- Dependency updates.

## 0.15.0

### Features :tada:

- authenticator: add AuthenticatorEntry id field.

## 0.14.0

### Features :tada:

- authenticator: offer new callback-based TOTP generator.
- authenticator: expose issuer property for TOTP entries

### Fixes :bug:

- authenticator: preserve steam name when importing an aegis export.
- authenticator: return MissingPassword error when importing an encrypted aegis backup without submitting a password.

### Other

## 0.13.5

### Features :tada:

- authenticator-web: offer a get_totp_params to get the params from an entry.
- authenticator-web: expose the issuer property of an entry.
- authenticator-mobile: offer a get_totp_params to get the params from an entry.
- authenticator-mobile: offer methods that take a single entry for serializing and deserializing.
- authenticator-mobile: expose the issuer property of an entry.

### Fixes :bug:

- authenticator: return MissingPassword error when importing an encrypted 2FAS backup without submitting a password.

## 0.13.4

### Features :tada:

- authenticator-web: offer web package for authenticator.
- authenticator-mobile: fix mobile logger interface for registering a logger.

### Fixes :bug:

- authenticator: preserve steam totp names when importing from 2fas.

## 0.13.3

### Fixes :bug:

- authenticator: use proper encryption AAD for EntryContent.

## 0.13.2

### Features :tada:

- pass-mobile and authenticator-mobile: update to uniffi 0.29.0.
- authenticator: offer crypto methods for encrypting and decrypting entries.

### Other

- BREAKING: authenticator: removal of `entry.actions` in favour of methods exposed in the `AuthenticatorMobileClient`.

## 0.13.1

### Features :tada:

- authenticator: offer methods for creating entries manually.

### Fixes :bug:

- authenticator: add missing file for swift library.

## 0.13.0

### Features :tada:

- totp: improve label parsing from TOTP URI.
- authenticator: more importers.
- authenticator: first version of the mobile bindings.

## 0.12.0

### Features :tada:

- web: cross-compile proton-pass-web/ui to ASM.js.
- authenticator: start implementing third-party authenticator importers.

### Fixes :bug:

- common: on the password scorer, publish the penalties regardless of the common password replacements (thanks Mattias Svanström). 

### Other

- common: update dependencies.

## 0.11.2

### Other

- common: adapt known issues of the MP4 file type on the file detector.

## 0.11.1

### Fix

- common: return penalties in long passwords.

## 0.11.0

### Feature

- common: add sanitization functions for known sites/requests that may have malformed passkey creation JSON requests.

## 0.10.0

### Feature

- common: offer functions for determining file types and MIME types based on content.

## 0.9.0

### Feature

- common: offer `HostParser` to unify host parsing.
- mobile: offer `HostParser` to unify host parsing.
- web: offer TOTP generator to web.

### Other

- mobile: upgrade `uniffi` dependency.
- mobile(android): upgrade `jna` dependency.

## 0.8.3

### Other

- common: upgrade `passkeys` dependency.

## 0.8.2

### Fix

- web: support pnpm and yarn v1 installs for @protontech/pass-rust-core

## 0.8.1

### Fix

- web: WASM build directory in publish stage.

## 0.8.0

### Other

- web: Split the features into 3 different rust features and binaries, so they can be imported independently.

## 0.7.13

### Fixes :bug:

- common: fix password scoring regex to take into account optional symbols at the end.

## 0.7.12

### Features

- common: support empty `pubKeyCredParams` in passkey creation request.

## 0.7.11

### Other

- common: ignore `proton.me` domain for missing 2FA check.

## 0.7.10

### Features :tada:

- web: Remove `tokio` dependency.
- web: Update from `tsify` to `tsify_next`.
- web: WASM size reduction.

## 0.7.9

### Features :tada:

- Migrate to regex_lite to reduce compiled wasm binary size
- Expose `check_password_scores` to check multiple passwords (web)
- Expose `twofa_domains_eligible` to check multiple 2fa eligible domains (web)

## 0.7.8

### Features :tada:

- Offer method for extracting full domain from URL.

### Fixes :bug:

- Fix domain extraction and root domain extraction.

## 0.7.7

### Features :tada:

- Offer method for extracting root domain using public suffix list.

### Fixes :bug:

- Parse domain using public suffix list for detecting missing 2FA.
- Adjustments with the password scorer.

## 0.7.6

### Fixes :bug:

- Fix credProps and type formatting for web.

## 0.7.5

### Other

- Improve password scorer.

## 0.7.4

### Feature

- Allow null `clientDataHash` for android passkey authentication.

## 0.7.3

### Feature

- Offer new API for challenge resolution on Android that makes use of the `clientDataHash`.

## 0.7.2

### Other

- Upgrade dependencies and `uniffi` for trying to avoid a memory leak.

## 0.7.1

### Other

- Use B64 representation for key id instead of hex one.

## 0.7.0

### Features

- Add a 2fa domain checker as part of the security center implementation.
- Improve web wasm API.

## 0.6.10

### Other

- Include custom AAGUID when generating passkeys.

## 0.6.9

### Fixes

- Versioning fixes.

## 0.6.8

### Other

- Configure Passkey authenticator display name.
- Expose new passkey fields to web.

## 0.6.7

### Other

- Add attestation_object to create passkey response for iOS.

## 0.6.6

### Features

- Add credential_id & user_handle to create passkey response.

## 0.6.5

### Features :tada:

- Prepare API to allow iOS to generate passkeys.

### Other

- Allow url without schema in passkey generation.

## 0.6.4

### Other

- Make passkey resolve challenge resilient to domain without protocol.

## 0.6.3

### Other

- Offer functions for parsing the passkey creation request.

## 0.6.2

### Other

- Expose more information when generating passkeys.

## 0.6.1

### Other

- Expose more information when generating passkeys.

## 0.6.0

### Features :tada:

- Initial passkey support.

## 0.5.6

### Fixes :bug:

- Fix TOTP generation.

## 0.5.5

### Other

- Relax restrictions when generating TOTP tokens.

## 0.5.4

### Other

- Add back `TotpUriParser`.

## 0.5.3

### Features

- Improve TOTP token generation to handle URIs and standalone secrets.

### Other

- Improved password scoring algorithm.

## 0.5.2

### Other

- Fixed password scoring algorithm.

## 0.5.1

### Other

- Renamed password scores.

## 0.5.0

### Features :tada:

- New password scoring algorithm.

## 0.4.0

### Features :tada:

- Credit card detector
- Better interfaces for web bindings

## 0.3.3

### Other

- Update of compilation settings of swift package to remove warnings

## 0.3.2

### Other

- Allow to generate TOTP token from secret

## 0.3.1

### Refactor

- Allow to pass time on TOTP token generation

## 0.3.0

### Features :tada:

- Allow to create signature bodies for NewUserInvites.

## 0.2.2 (2023-10-11)

### Fixes :bug:

- Handle TOTP URI with empty secret

## 0.2.1 (2023-10-10)

### Fixes :bug:

- Android: Specify JNA as an AAR dependency explicitly.
- Handle empty edited TOTP URI

## 0.2.0 (2023-10-06)

### Features :tada:

- Password generation.

### Other

- Auto-publish.

## 0.1.0 (2023-10-03)

First version of the library.

### Features :tada:

- Alias prefix validation.
- TOTP parsing.
