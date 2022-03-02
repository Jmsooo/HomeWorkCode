package code07;

public class Receptionist {
    private Filter filter;

    public Receptionist() {
    }

    public Receptionist(Filter filter) {
        this.filter = filter;
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public void recept(User user){
        if (user.getType() != null){
            return;
        }
        filter.filterUser(user);
    }

}
