package SeccionB;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class TestEmployer {
	@Test
    public void testWorkerUSDMesPar() {
        Employee employee = new Employee(1000.0F, "USD", 0.1F, EmployeeType.Worker);
        float result = employee.cs();
        assertEquals(1000.0F, result, 0.01F);
    }

    @Test
    public void testWorkerEURMesImpar() {
        Employee employee = new Employee(1000.0F, "EUR", 0.1F, EmployeeType.Worker);
        float result = employee.cs();
        assertEquals(997.5F, result, 0.01F);
    }

    @Test
    public void testCalculateSalarySupervisor() {
        Employee employee = new Employee(1500.0F, "USD", 0.15F, EmployeeType.Supervisor);
        float result = employee.cs();
        assertEquals(1730.0F, result, 0.01F);
    }

    @Test
    public void testCalculateSalaryManager() {
        Employee employee = new Employee(2000.0F, "USD", 0.2F, EmployeeType.Manager);
        float result = employee.cs();
        assertEquals(2330.0F, result, 0.01F);
    }
    
    @Test
    public void testCalculateYearBonusWorkerUSD() {
        Employee employee = new Employee(1000.0F, "USD", 0.1F, EmployeeType.Worker);
        float result = employee.CalculateYearBonus();
        assertEquals(386.0F, result, 0.01F);
    }

    @Test
    public void testCalculateYearBonusWorkerNonUSD() {
        Employee employee = new Employee(1000.0F, "EUR", 0.1F, EmployeeType.Worker);
        float result = employee.CalculateYearBonus();
        assertEquals(386.0F, result, 0.01F);
    }

    @Test
    public void testCalculateYearBonusSupervisor() {
        Employee employee = new Employee(1500.0F, "USD", 0.15F, EmployeeType.Supervisor);
        float result = employee.CalculateYearBonus();
        assertEquals(579.0F, result, 0.01F);
    }

    @Test
    public void testCalculateYearBonusManager() {
        Employee employee = new Employee(2000.0F, "USD", 0.2F, EmployeeType.Manager);
        float result = employee.CalculateYearBonus();
        assertEquals(772.0F, result, 0.01F);
    }

}
