package pruebas;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunnerPartitions {

	public static void main(String[] args) {
		Result resultadoParticion = JUnitCore.runClasses(TestPartition.class, TestPartition2.class, TestPartition3.class);
		for (Failure failure : resultadoParticion.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(resultadoParticion.wasSuccessful());
	}

}
