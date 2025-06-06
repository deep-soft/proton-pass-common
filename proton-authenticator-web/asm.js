/**
 * Runtime initialization for ASM.js compilation of WebAssembly modules
 *
 * This template serves as the entry point for ASM.js fallback when WebAssembly
 * is not available. It maintains API compatibility with the WASM version by using
 * the same wasm-bindgen generated glue code.
 *
 * This maintains the same external API as the WASM version while substituting
 * the WASM backend with an ASM.js implementation, allowing the code to run in
 * environments where WebAssembly is not supported.
 */

import asm from "./proton_authenticator_web_bg.asm.js";
import * as $_proton_authenticator_web_bg_js from "./proton_authenticator_web_bg.js";
const wasm = asm({ "./proton_authenticator_web_bg.js": $_proton_authenticator_web_bg_js });
export * from "./proton_authenticator_web_bg.js";
$_proton_authenticator_web_bg_js.__wbg_set_wasm(wasm);
