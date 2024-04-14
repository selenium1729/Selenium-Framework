import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class FunctionsIntro {
	public void getData() {
	 System.out.println("Rahul shetty academy");
	}
	public String getData1() {
		return "Selenium";
	}
	public static int getData3() {
		return 5;
	}
	public static void main(String[] args) {
		FunctionsIntro b= new FunctionsIntro();
		b.getData();
		String str =b.getData1();
		System.out.println(str);
		int a= getData3();
		System.out.println(a);
	}

}
