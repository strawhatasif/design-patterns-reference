package additional.dto;


public class DomainService {

    public DomainObjectDTO getData()
    {
        // assume backend service
        DomainObject domainObject = getObject();
        DomainObjectDTO domainObjectDTO = new DomainObjectDTO();
        domainObjectDTO.setAproperty(domainObject.getAproperty());
        return domainObjectDTO;
    }

    private DomainObject getObject()
    {
        return new DomainObject();
    }

}
