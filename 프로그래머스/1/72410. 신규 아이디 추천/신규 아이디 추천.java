class Solution {
    public String solution(String new_id) {

        new_id = new_id.toLowerCase();

        StringBuilder sb = new StringBuilder();
        for (char c : new_id.toCharArray()) {
            if (Character.isLetterOrDigit(c) || c == '-' || c == '_' || c == '.') {
                sb.append(c);
            }
        }
        new_id = sb.toString();

        sb.setLength(0);
        char prev = 0;
        for (char c : new_id.toCharArray()) {
            if (c == '.' && prev == '.') {
                continue;
            }
            sb.append(c);
            prev = c;
        }
        new_id = sb.toString();


        if (new_id.startsWith(".")) {
            new_id = new_id.substring(1);
        }
        if (new_id.endsWith(".")) {
            new_id = new_id.substring(0, new_id.length() - 1);
        }


        if (new_id.isEmpty()) {
            new_id = "a";
        }


        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
            if (new_id.endsWith(".")) {
                new_id = new_id.substring(0, new_id.length() - 1);
            }
        }


        while (new_id.length() <= 2) {
            new_id += new_id.charAt(new_id.length() - 1);
        }

        return new_id;
        
        
        /* 정규표현식 풀이
        new_id = new_id.toLowerCase();

        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
        
        new_id = new_id.replaceAll("\\.{2,}", ".");
        
        new_id = new_id.replaceAll("^\\.|\\.$", "");
        
        if (new_id.isEmpty()) {
            new_id = "a";
        }
        
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
            new_id = new_id.replaceAll("\\.$", "");
        }
        
        while (new_id.length() <= 2) {
            new_id += new_id.charAt(new_id.length() - 1);
        }
        
        return new_id;
        */
    }
}
