package clarify;




/**
 * Created by prathamesh on 8/27/18.
 */


/**
 *
public class ApproximateSolution {

//    public static void parse(JSONObject object) {
//
//        JSONObject result = new JSONObject();
//        JSONArray data = object.getJSONArray("data");
//
//        int count = 0;
//
//        for (int i = 0; i < data.length(); i++) {
//            int population = (int)data.getJSONObject(i).get("population");
//            if(population > )
//        }
//    }

//    static int getCountries(String str, int p) throws IOException {
//        String url = "https://jsonmock.hackerrank.com/api/countries/search?name=" + str;
//
//        URL httpURL = new URL(url);
//        HttpURLConnection conn = (HttpURLConnection) httpURL.openConnection();
//        conn.setRequestMethod("GET");
//        BufferedReader in = new BufferedReader(
//                new InputStreamReader(conn.getInputStream()));
//        String inputLine;
//        StringBuffer response = new StringBuffer();
//        while ((inputLine = in.readLine()) != null) {
//            response.append(inputLine);
//        }
//        in.close();
//        JSONObject myResponse = new JSONObject(response.toString());
//
//        JSONObject result = new JSONObject();
//        JSONArray data = myResponse.getJSONArray("data");
//
//        int count = 0;
//
//        for (int i = 0; i < data.length(); i++) {
//            int population = (int)data.getJSONObject(i).get("population");
//            if(population > p){
//                count++;
//            }
//        }
//
//        return count;
//    }

    static int getCountries(String str, int p) throws Exception {
        String url = "https://jsonmock.hackerrank.com/api/countries/search?name=" + str;

        URL httpURL = new URL(url);
        HttpURLConnection conn = (HttpURLConnection) httpURL.openConnection();
        conn.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(conn.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        System.out.println(response);
        JSONParser parser = new JSONParser();

        in.close();
        // JSONObject myResponse = new JSONObject(response.toJSONString());
        JSONObject myResponse = (JSONObject) parser.parse(response.toString());
        JSONObject result = new JSONObject();
        JSONArray data = myResponse.getJSONArray("data");

        int count = 0;

        for (int i = 0; i < data.length(); i++) {
            int population = (int)data.getJSONObject(i).get("population");
            if(population > p){
                count++;
            }
        }
        return 0;
    }


    public static void main(String args[]) throws Exception {
//        String url = "https://jsonmock.hackerrank.com/api/countries/search?name=un";
//
//        URL httpURL = new URL(url);
//        HttpURLConnection conn = (HttpURLConnection) httpURL.openConnection();
//        conn.setRequestMethod("GET");
//        BufferedReader in = new BufferedReader(
//                new InputStreamReader(conn.getInputStream()));
//        String inputLine;
//        StringBuffer response = new StringBuffer();
//        while ((inputLine = in.readLine()) != null) {
//            response.append(inputLine);
//        }
//        in.close();
//        JSONObject myResponse = new JSONObject(response.toString());
//        ApproximateSolution.parse(myResponse);
        ApproximateSolution.getCountries("un", 0);
    }
}



*/