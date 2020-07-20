import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.jupiter.api.Assertions.*;

class JobTest {

    static Job testJob1;
    static Job testJob2;

    @BeforeAll
    public static void createJob() {
        testJob1 = new Job();
        testJob2 = new Job();
    }

    @Test
    public void testSettingJobId() {
        assertFalse(testJob1.equals(testJob2));
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        assertEquals(3, job.getId());
        assertEquals("Product tester", job.getName());
        assertEquals("ACME", job.getEmployer().getValue());
        assertEquals("Desert", job.getLocation().getValue());
        assertEquals("Quality control", job.getPositionType().getValue());
        assertEquals("Persistence", job.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(testJob1.equals(testJob2));
    }
}
