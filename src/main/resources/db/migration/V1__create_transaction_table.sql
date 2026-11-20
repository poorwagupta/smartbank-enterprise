CREATE TABLE transactions
(
    id UUID PRIMARY KEY,
    account_number VARCHAR(100),
    amount NUMERIC(15,2),
    transaction_type VARCHAR(50),
    status VARCHAR(30),
    risk_score INTEGER,
    created_at TIMESTAMP
);