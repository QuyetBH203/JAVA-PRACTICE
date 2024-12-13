package TCP;

import java.io.Serializable;

public class Customer implements Serializable {
    private int id;
    private String code;
    private String name;
    private String dayOfBirth;
    private String userName;

    private static final long serialVersionUID = 20170711;


    public Customer(int id, String code, String name, String dayOfBirth, String userName) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void normalizeName(){
        String[] arr = this.name.split("\\s+");
        String[] ans = this.name.toLowerCase().split("\\s+");
        StringBuilder res = new StringBuilder();
        for(int i=0;i<arr.length-1;i++){
            res.append(arr[i].substring(0, 1).toUpperCase()).append(arr[i].substring(1).toLowerCase()).append(" ");
        }
        res = new StringBuilder(arr[arr.length - 1].toUpperCase() + ", " + res.toString().trim());
        this.name = res.toString();
        StringBuilder tmp= new StringBuilder();
        for(int i=0;i<ans.length-1;i++){
            tmp.append(ans[i].charAt(0));
        }
        tmp.append(ans[ans.length - 1]);
        this.userName= tmp.toString();

    }
    public void normalizeDate(){
        if (this.dayOfBirth.charAt(1) == '-') {
            this.dayOfBirth = "0" + this.dayOfBirth;
        }
        if (this.dayOfBirth.charAt(4) == '-') {
            this.dayOfBirth = this.dayOfBirth.substring(0, 3) + "0" + this.dayOfBirth.substring(3);
        }

        String[] res =this.dayOfBirth.split("-");
        this.dayOfBirth = res[1]+"/"+res[0]+"/"+res[2];
    }


    @Override
    public String toString() {
        return "Customer918{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
