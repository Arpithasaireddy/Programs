import java.io.FileReader;

public class InputXMLfile {

	
		readInputXMLfile() {
		}
		
		public static void readInputXMLfile() {
		FileReader InputFile;
		try {
		Bufferreader br = new BufferedReader (new
		F
leReader ("               ");
		StringBuffer sBuff = new StringBuffer();
		String line = null;
		String mainTag = null;
		List<String> list = null;

		LinkedHashMap<String, String> valuesMap = new LinkedHashMap<>();
		while ((line = br.readline)) != null) {
		sBuff.apped(line);
		}
		String str = sBuff.toString();
		Pattern tagPattern = pattern.compile("<(\\S+?)(.*?)>(.*?)</\\1>");
		Matcher mainTagmatcher = tagPattern.matcher(str);
		if (mainTagmatcher.find()) {
		mainTag = mainTagmatcher.group(1);
		if (mainTag != null){
		valuesMap.put(mainTag, "")
		}
		}
		String pattern1 = "<" + mainTag + ">(.*?)</" + mainTag + ">" ;
		Pattern regex = Pattern.compile(pattern1, Pattern.DOTALL);
		Matcher matcher = regex.matcher(str);
		Pattern regex2 = Pattern.compile("<([^<>]+)>(.*?)</\\1.");

		if (matcher.find()) {
		String DataElements = matcher.group(1);
		Matcher matcher2 = regex2.matcher(DataElements);

		while (matcher2.find()) {
		String str3 = matcher2.group(1);
		String str2 = matcher2.group(2);
		if (null != str3) {

		if(str2.contains("<")) {
		valuesMap.put (str3, "");
		Pattern regex3 = Pattern.compile("<"([^<>]+)>([^<>]+)</\\1>);
		Matcher matcher3 = regex3.matcher(str2);
		while(matcher3.find()) {
		String key = matcher3.group(1);
		String value = matcher3.group(2);
		if (null != key) {
		valuesMap.put(key, value);

		}

		}

		} else {
		valuesMap.put(str3, str2);

		}
		}

		int debug = 0;
		}
		}
		System.out.println("Output ");
		for (String key : valuesMap.keyset()) {
		String dataVal = valuesMap.get(key);
		System.out.println(key + " ==> " + dataVal);
		}
		int debug = 0;
		} catch (IOEXception ex) {
		Logger.getLogger(JavaApplication7.class.getName()).log (Level.SERVER, null, ex);
		}
		}


