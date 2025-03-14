use crate::AuthenticatorEntryModel;
use proton_authenticator::AuthenticatorClient;
use std::hint::black_box;

pub struct MobileTotpBenchmark {
    milliseconds: u64,
}

impl MobileTotpBenchmark {
    pub fn new(milliseconds: u64) -> Self {
        Self { milliseconds }
    }

    pub fn run(&self, entry: AuthenticatorEntryModel) -> u64 {
        let start = chrono::Utc::now();
        let as_entry = entry.to_entry().unwrap();

        let mut count = 0;
        let entries = vec![as_entry];
        loop {
            let now = chrono::Utc::now();
            if (now - start).num_milliseconds() > self.milliseconds as i64 {
                break;
            }

            let codes = AuthenticatorClient
                .generate_codes(&entries, now.timestamp() as u64)
                .unwrap();
            black_box(codes);
            count += 1;
        }

        count
    }
}
