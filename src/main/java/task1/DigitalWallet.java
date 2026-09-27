package task1;

/**
 * Task 1: The 'Broken Vault' - refactored for encapsulation.
 *
 * Business rules enforced:
 * - balance can never be negative (checked on both construction and withdraw)
 * - pinCode is set once in the constructor, never exposed or changeable afterward
 * - withdraw() only succeeds if the entered PIN matches AND funds are sufficient
 */
public class DigitalWallet {

    private String accountHolder;
    private double balance;
    private final String pinCode; // final: can never be reassigned after construction

    public DigitalWallet(String accountHolder, double initialBalance, String pinCode) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.pinCode = pinCode;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // NOTE: deliberately no getPinCode() - the PIN must never be readable from
    // outside the class, only checked internally against what the caller provides.

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Cannot deposit a negative amount.");
        }
        balance += amount;
    }

    /**
     * Attempts to withdraw amount from the wallet.
     * @param amount the amount requested
     * @param enteredPin the PIN supplied by the caller
     * @return true if the PIN matched and funds were sufficient (withdrawal
     *         processed); false otherwise (nothing is changed on failure)
     */
    public boolean withdraw(double amount, String enteredPin) {
        if (!pinCode.equals(enteredPin)) {
            return false; // wrong PIN - fail without revealing why in more detail
        }
        if (amount < 0 || amount > balance) {
            return false; // invalid amount or insufficient funds
        }
        balance -= amount;
        return true;
    }
}
