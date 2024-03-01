public class Employee {
    // Nitelikleri
    String name;
    int salary;
    int wHours;
    int wYear;

    Employee(String name, int salary, int wHours, int wYear){
        this.name = name;
        this.salary = salary;
        this.wHours = wHours;
        this.wYear = wYear;
    }
    //Vergi hesaplaması
    public double tax(){
        double taxAmount = 0.0;
        if (this.salary > 1000) {
            taxAmount = this.salary * 0.03;
        }
        return taxAmount;
    }
    //Maaş bonus ücret
    public double bonus(){
        double bonusAmount = 0.0;
        if (this.wHours > 40) {
            bonusAmount = (this.wHours - 40.0) * 30.0;
        }
        return bonusAmount;
    }
    //Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır.
    public double raiseSalary(){
        double raisedSalary = 0.0;
        //Çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
        if ((2021-wYear) < 10){
            raisedSalary = (int) (this.salary * 0.05);

            //Çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
        } else if ((2021 - wYear) < 9 && (2021 - wYear) < 20) {
            raisedSalary = (int) (this.salary * 0.1);

            //Çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
        } else if ((2021 - wYear) > 19) {
            raisedSalary = (int) (this.salary * 0.15);
        }
        return raisedSalary;
    }
    //Çalışan bilgileri ekrana bastırılacak.
    public void printEmployee(){
        double salaryTaxBonus = this.salary-tax()+bonus();
        double totalSalary = salaryTaxBonus+raiseSalary();

        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary + " TL");
        System.out.println("Çalışma saati: " + this.wHours);
        System.out.println("Başlangıç yılı: " + this.wYear);
        System.out.println("Vergi: " + tax() + " TL");
        System.out.println("Bonus: " + bonus() + " TL");
        System.out.println("Maaş artışı: " + raiseSalary() + " TL");
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + salaryTaxBonus + " TL");
        System.out.println("Toplam Maaş: " + totalSalary + " TL");
    }
}