public class Main {
    public static void main(String[] args) {
       Car granta = new Car("Lada" , " Granta", "Желтого", " России", 1.7, 2015);
       Car audi = new Car("Audi","A8 50 L TDI quattro","черного","Германии",3.0,2020);
       Car bmw = new Car("BMW","Z8", "черного", "Германии", 3.0,2021);
       Car kia =new Car("Kia", "Sportage 4-го поколения", " красного","Южной Корее", 2.4, 2018);
       Car hundai = new Car("Hyundai","Avante", "оранжевый","Южной Корее", 1.6, 2016);
        System.out.println(granta);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hundai);
    }
}