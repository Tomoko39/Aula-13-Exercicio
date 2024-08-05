import com.github.javafaker.Faker;

public class FuncionariosRepositorio {
    private Faker faker;

    public FuncionariosRepositorio() {
        faker = new Faker();
    }

    public String randomCpf() {
        return String.format("%03d.%03d.%03d-%02d",
            faker.number().numberBetween(0, 999),
            faker.number().numberBetween(0, 999),
            faker.number().numberBetween(0, 999),
            faker.number().numberBetween(0, 99)
        );
    }

    public Funcionario randomFuncionario() {
        return new Funcionario(
            faker.name().fullName(),
            randomCpf(),
            faker.phoneNumber().phoneNumber(),
            faker.internet().emailAddress(),
            faker.address().fullAddress(),
            faker.number().randomDouble(2, 500, 700),
            faker.number().randomDouble(2, 500, 700),
            faker.number().randomDouble(2, 500, 700),
            faker.number().randomDouble(2, 500, 700),
            faker.number().randomDouble(2, 3000, 7000)
        );
    }

    public Vendedor randomVendedor() {
        return new Vendedor(
            faker.name().fullName(),
            randomCpf(),
            faker.phoneNumber().phoneNumber(),
            faker.internet().emailAddress(),
            faker.address().fullAddress(),
            faker.number().randomDouble(2, 500, 700),
            faker.number().randomDouble(2, 500, 700),
            faker.number().randomDouble(2, 500, 700),
            faker.number().randomDouble(2, 500, 700),
            faker.number().randomDouble(2, 3000, 7000),
            faker.number().randomDouble(2, 0, 100000),
            faker.number().randomDouble(2, 0, 1) / 10
        );
    }

    public AssistenteAdministrativo randomAssistenteAdministrativo() {
        return new AssistenteAdministrativo(
            faker.name().fullName(),
            randomCpf(),
            faker.phoneNumber().phoneNumber(),
            faker.internet().emailAddress(),
            faker.address().fullAddress(),
            faker.number().randomDouble(2, 500, 700),
            faker.number().randomDouble(2, 500, 700),
            faker.number().randomDouble(2, 500, 700),
            faker.number().randomDouble(2, 500, 700),
            faker.number().randomDouble(2, 3000, 7000),
            faker.number().randomDouble(2, 0, 40)
        );
    }
}
