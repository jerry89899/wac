package nl.hu.v1wac.firstapp.persistence;

public class Country {
	private String code;
	private String name;
	private String continent;
	private String region;
	private Double surface;
	private int population;
	private int latitude;
	private int longitude;
	private String capital;
	private String governmentForm;
	
	public Country(String code, String name, String continent, String region, Double surface, int population,
			int latitude, int longitude, String capital, String governmentForm) {
		super();
		this.code = code;
		this.name = name;
		this.continent = continent;
		this.region = region;
		this.surface = surface;
		this.population = population;
		this.latitude = latitude;
		this.longitude = longitude;
		this.capital = capital;
		this.governmentForm = governmentForm;
	}

	public Country(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Double getSurface() {
		return surface;
	}

	public void setSurface(Double surface) {
		this.surface = surface;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getLatitude() {
		return latitude;
	}

	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

	public int getLongitude() {
		return longitude;
	}

	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getGovernmentForm() {
		return governmentForm;
	}

	public void setGovernmentForm(String governmentForm) {
		this.governmentForm = governmentForm;
	}
}