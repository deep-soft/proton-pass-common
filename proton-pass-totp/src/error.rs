use proton_pass_derive::Error;
use url::ParseError;

#[derive(Debug, Error, PartialEq, Eq)]
pub enum TOTPError {
    NotTotpUri,
    InvalidAuthority(String),
    NoAuthority,
    InvalidAlgorithm(String),
    InvalidScheme(String),
    URLParseError(ParseError),
    NoSecret,
    EmptySecret,
    NoQueries,
    SecretParseError,
    InvalidPeriod,
    InvalidDigits,
}
