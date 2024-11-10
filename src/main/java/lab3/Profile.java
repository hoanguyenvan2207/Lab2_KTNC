package lab3;

public class Profile {
    private String name;

    private Integer age;

    private Boolean gender;

    public Profile(String name, Integer age, Boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Profile() {
    }

    public String GetName() {
        if(name == null){
            throw new NullPointerException("Tên người dùng chưa được cấu hình");
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }
}
