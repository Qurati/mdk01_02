import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    private BankAccount account;
    private int beforeTestTransactions;

    @BeforeAll
    static void initAll() {
        BankAccount.resetTotalTransactions();
    }

    @BeforeEach
    void setUp() {
        account = new BankAccount("Петров", 1000.0);
        beforeTestTransactions = BankAccount.getTotalTransactions();
    }

    @AfterEach
    void tearDown() {
        // "Обнуляем" счет или просто логируем завершение теста
        System.out.println("  🧹 Тест завершен. Очистка не требуется, объект будет удален сборщиком мусора.");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("🏁 Все тесты BankAccount завершены. Освобождение общих ресурсов.");
    }

    private boolean testDepositCalled = false;
    private boolean testWithdrawSuccessCalled = false;

    @Test
    void testInitialBalance() {
        assertEquals(1000.0, account.getBalance());
    }

    @Test
    @DisplayName("Тест: Пополнение счета увеличивает баланс 📈")
    void testDeposit() {
        double balanceBefore = account.getBalance();
        testDepositCalled = true;
        account.deposit(500.0);
        beforeTestTransactions++;
        assertEquals(balanceBefore + 500.0, account.getBalance(), 0.001);
    }

    @Test
    @DisplayName("Тест: Снятие средств уменьшает баланс 📉")
    void testWithdrawSuccess() {
        testWithdrawSuccessCalled = true;
        boolean result = account.withdraw(300.0);
        beforeTestTransactions++;
        assertTrue(result);
        assertEquals(700.0, account.getBalance());
    }
    @Test
    @DisplayName("Тест: Снятие средств больше баланса невозможно 🚫")
    void testWithdrawFail() {
        boolean result = account.withdraw(1500.0);
        assertFalse(result);
        assertEquals(1000.0, account.getBalance(), "Баланс не должен измениться");
        System.out.println("    ⚔️ Выполняется testWithdrawFail");
    }
}