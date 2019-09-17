package ${package}.orika;

public class OrikaMappingConfig {

    @Bean
    public MapperFacade mapper() {
        final MapperFactory mapperFactory = new DefaultMapperFactory.Builder().mapNulls(false).build;

        //TODO add logic on configure mappers

        return mapperFactory.getMapperFacade();
    }
}