import org.springframework.web.bind.annotation.PostMapping;
import java.util.Date;

public class Functions {
    
    public void saveIncome(Income income) {
        inRepo.save(income);
    }

    public void saveExpense(Expense expense) {
        outRepo.save(expense);
    }

    @PostMapping("/user")
    public User saveUser(User user) {
        return userService.save(user);
    }

    public void saveUser(User user) {
        userService.save(user);
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }
    public void setRole(User user){
        user.setRole(user);
    }

    public Environment getEnvironment() {
        return environmentService.getEnvironment(getVersion());
    }

    public Release getRelease() {
        return releaseService.getRelease(getVersion());
    }

    private String getVersion() {
        return versionService.getVersion();
    }

    private IncomeRepository inRepo;
    private ExpenseRepository outRepo;
    private UserService userService;
    private UserRepository userRepository;
    private VersionService versionService;
    private EnvironmentService environmentService;
    private ReleaseService releaseService;
}
