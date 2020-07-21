import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.jupiter.api.Assertions.*;

class JobTest {

    static Job testJob1;
    static Job testJob2;
    static Job job = new Job("Product tester", new Employer("ACME"),
            new Location("Desert"), new PositionType("Quality control"),
            new CoreCompetency("Persistence"));
    static Job notFullData = new Job("Product tester", new Employer("ACME"),
            new Location("Desert"), new PositionType("Quality control"),
            new CoreCompetency(""));

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

    @Test
    public void testStartEndToString() {
        assertTrue(job.toString().startsWith("\n"));
        assertTrue(job.toString().endsWith("\n"));
    }

    @Test
    public void testDataToString() {
        String res = "\n";
        res += "ID: " + job.getId() + "\n";
        res += "Name: " + job.getName() + "\n";
        res += "Employer: " + job.getEmployer().toString() + "\n";
        res += "Location: " + job.getLocation().toString() + "\n";
        res += "Position Type: " + job.getPositionType().toString() + "\n";
        res += "Core Competency: " + job.getCoreCompetency().toString() + "\n";
        assertEquals(res, job.toString());
    }

    @Test
    public void testNoDataToString() {
        assertEquals("OOPS! This job does not seem to exist.", testJob1.toString());
    }

    @Test
    public void testNotFullDataToString() {

    }
}
