package ltw.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class PirateNameGenerator implements NameGeneratorAble{

    public String generateName() {
        String[] names = new String[]{"Cap'n Blaine Greenbeard", "Wally Knocknees", "Stutterin' Ross Smithe"};
        return names[new Random().nextInt(2)];
    }
    
    public static void main(String[] args) {
        String generateName = new PirateNameGenerator().generateName();
        System.out.println(generateName);
    }

}
