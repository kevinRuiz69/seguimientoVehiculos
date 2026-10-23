import java.util.Date;

public class Aplicaccion {
    public static void main(String[] args) {


        AutoRent autoRent = new AutoRent(
                "AutoRent S.A.S.",
                "900.123.456-7",
                "Armenia, Quindío");


        Turista turista = new Turista(
                "1098765432",
                "John Smith",
                "john.smith@email.com",
                "VISA-USA-7845");

        Residente residente = new Residente(
                "94512368",
                "María Fernanda Gómez",
                "mafe.gomez@email.com",
                "Barrio La Castellana, Armenia");

        Carro carro = new Carro(
                "ABC-123",
                "Chevrolet",
                "Onix Turbo",
                "2023",
                10000,
                true,
                "4");

        Moto moto = new Moto(
                "XYZ-78A",
                "Yamaha",
                "MT-03",
                "2022",
                10000,
                true,
                "321 cc");

        Camioneta camioneta = new Camioneta(
                "DEF-456",
                "Toyota",
                "Hilux 4x4",
                "2024",
                10000,
                false,
                "1070");


        int dias = 3;
        Alquiler alquiler = new Alquiler(
                "12,03,2026",
                16,
                turista,
                carro);


        System.out.print(autoRent);
        System.out.print(turista);
        System.out.print(residente);
        System.out.print(carro);
        System.out.print(moto);
        System.out.print(camioneta);
        System.out.print(alquiler);
    }
}
