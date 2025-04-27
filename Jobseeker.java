class Jobseeker extends User {
    private String resume;
    
    public Jobseeker(String email, String password, String resume) {
        super(email, password);
        this.resume = resume;
    }

    public String getResume() {
        return resume;
    }
}
