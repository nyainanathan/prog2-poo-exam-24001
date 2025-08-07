import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Test {
    private int id;
    private String name;

    public static void main(String[] a){
        Test test = new Test(1,"test");
    }

}
