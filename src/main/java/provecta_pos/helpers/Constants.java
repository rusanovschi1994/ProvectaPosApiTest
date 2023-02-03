package provecta_pos.helpers;

public class Constants {

    public static class RunVariable {

        public static String server = Server.PROVECTA_URL;
        public static String path = Path.PROVECTA_PATH;
    }

    public static class Server {

        public static String PROVECTA_URL = "http://zamolxis.cloudapp.net:60034/";
    }

    public static class Path {

        public static String PROVECTA_PATH = "api/v1/";
    }

    public static class Actions {

        public static String PROVECTA_POST_LOGIN = "framework/common/login";
        public static String PROVECTA_GET_ARTICLE = "stock/article/select";
        public static String PROVECTA_GET_BRANCH = "framework/owner/branch/select";
    }
}
