package easy.DefangingAnIPAddress;
//Defanging an IP Address
public class DefangIPaddr {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}

