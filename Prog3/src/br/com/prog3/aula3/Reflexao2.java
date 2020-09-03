package br.com.prog3.aula3;


public class Reflexao2 {
    public static void main(String[] args) {
        try {
            System.out.println(Class.forName("br.com.prog3.aula3.Carro"));
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        Class c1 = Double.TYPE;
        System.out.println(c1);
        c1 = Void.TYPE;
        System.out.println(c1);
        c1 = Integer.TYPE;
        System.out.println(c1);
        Class c2 = br.com.prog3.aula3.Carro.class.getSuperclass();
        System.out.println(c2);
        Class<?>[] c3 = Character.class.getClasses();
        for (Class cs : c3){
            System.out.println(cs.getName());
        }
        System.out.println();
        Class<?>[] c4 = Character.class.getDeclaredClasses();
        for(Class cs : c4){
            System.out.println(cs.getName());
        }

    }
}
