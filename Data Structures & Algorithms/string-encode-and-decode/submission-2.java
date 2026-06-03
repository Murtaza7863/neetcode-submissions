class Solution {

    public String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();

        for (String s : strs) {
            sb.append(s.length());
            sb.append("#");
            sb.append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {

        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {

            StringBuilder num = new StringBuilder();

            while (str.charAt(i) != '#') {
                num.append(str.charAt(i));
                i++;
            }

            int len = Integer.parseInt(num.toString());

            i++;

            String word = str.substring(i, i + len);

            result.add(word);

            i += len;
        }

        return result;
    }
}
