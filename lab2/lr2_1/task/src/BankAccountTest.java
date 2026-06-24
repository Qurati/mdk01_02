import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    private BankAccount account;
    private int transactionsBefore;

    @BeforeAll
    static void beforeAll() {
        BankAccount.totalTransactions = 0;
        System.out.println("Начало тестирования");
    }

    @BeforeEach
    void setUp() {
        account = new BankAccount("Петров", 1000);
        transactionsBefore = BankAccount.totalTransactions;
        System.out.println("\nСоздан новый счет.");
        System.out.println("Начальный баланс = " + account.getBalance());
    }

    @AfterEach
    void tearDown() {
        System.out.println("Количество транзакций: " + BankAccount.totalTransactions);
    }

    @AfterAll
    static void afterAll() {
        System.out.println("\nВсе тесты завершены");
        System.out.println("Всего транзакций: " + BankAccount.totalTransactions);
    }

    @Test
    @DisplayName("Начальный баланс")
    void testInitialBalance() {
        System.out.println("Баланс после проверки: " + account.getBalance());
        assertEquals(1000, account.getBalance(), 0.001);
    }

    @Test
    @DisplayName("Пополнение счета")
    void testDeposit() {
        account.deposit(500);
        System.out.println("Баланс после пополнения = " + account.getBalance());
        assertEquals(1500, account.getBalance(), 0.001);
        assertEquals(transactionsBefore + 1, BankAccount.totalTransactions);
    }

    @Test
    @DisplayName("Снятие денег")
    void testWithdraw() {
        boolean result = account.withdraw(300);
        System.out.println("Баланс после снятия = " + account.getBalance());
        assertTrue(result);
        assertEquals(700, account.getBalance(), 0.001);
        assertEquals(transactionsBefore + 1, BankAccount.totalTransactions);
    }
    @Test
    @DisplayName("Неудачное снятие")
    void testWithdrawFail() {
        boolean result = account.withdraw(1500);
        System.out.println("Баланс после неудачного снятия = " + account.getBalance());
        assertFalse(result);
        assertEquals(1000, account.getBalance(), 0.001);
        assertEquals(transactionsBefore, BankAccount.totalTransactions);
    }
}