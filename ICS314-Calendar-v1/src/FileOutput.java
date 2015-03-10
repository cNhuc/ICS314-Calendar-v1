import java.io.*;

public class FileOutput {

    String location, priority, summary;
    int priorityNum;
    String sDateTime, eDateTime;
    
    public FileOutput(String location, String summary, String sDateTime, String eDateTime) {
    	this.location = location;
    	this.summary = summary;
    	this.sDateTime = sDateTime;
    	this.eDateTime = eDateTime;

    }
    
	public void fo() {
		FileOutputStream fop = null;
		File file;
		
		String begin = "BEGIN:VCALENDAR\n";
		String version = "VERSION:1.0\n";
		String calscale = "CALSCALE:GREGORIA\n";
		String calname = "X-WR-CALNAME:Longan Cal\n";
		String timezone = "X-WR-TIMEZONE:Pacific/Honolulu\n";
		String begin2 = "BEGIN:VEVENT\n";
		String classtype = "CLASS:PUBLIC\n";
		String location = "LOCATION:" + this.location +"\n";
		String priority = "PRIORITY:HIGH\n";
		String summary = "SUMMARY:" + this.summary + "\n";
		String dStart = "DTSTART;TZID=Pacific/Honolulu:" + sDateTime + "Z\n";
		String dEnd = "DTEND;TZID=Pacific/Honolulu:" + eDateTime + "Z\n";
		String end2 = "END:VEVENT\n";
		String end = "END:VCALENDAR\n";
		
		try {
			/* File name will be longan.ics */
			file = new File("longan.ics");
			fop = new FileOutputStream(file);
			
			/* Create new file if it wasn't created */
			if (!file.exists()) {
				file.createNewFile();
			}
			
			/* Converting data to bytes */
			byte[] versiontoBytes = version.getBytes();
			byte[] classtypetoBytes = classtype.getBytes();
			byte[] locationtoBytes = location.getBytes();
			byte[] prioritytoBytes = priority.getBytes();
			byte[] summarytoBytes = summary.getBytes();
			byte[] dStarttoBytes = dStart.getBytes();
			byte[] dEndtoBytes = dEnd.getBytes();
			byte[] begintoBytes = begin.getBytes();
			byte[] calscaletoBytes = calscale.getBytes();
			byte[] calnametoBytes = calname.getBytes();
			byte[] timezonetoBytes = timezone.getBytes();
			byte[] begin2toBytes = begin2.getBytes();
			byte[] endtoBytes = end.getBytes();
			byte[] end2toBytes = end2.getBytes();
			
			/* Writing data values to the file */
			fop.write(begintoBytes);
			fop.write(versiontoBytes);
			fop.write(calscaletoBytes);
			fop.write(calnametoBytes);
			fop.write(timezonetoBytes);
			fop.write(begin2toBytes);
			fop.write(classtypetoBytes);
			fop.write(locationtoBytes);
			fop.write(prioritytoBytes);
			fop.write(summarytoBytes);
			fop.write(dStarttoBytes);
			fop.write(dEndtoBytes);
			fop.write(end2toBytes);
			fop.write(endtoBytes);
			
			/* Flush and close file */
			fop.flush();
			fop.close();
			
			System.out.println("File has been written to!");  //Let user know file is done
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
