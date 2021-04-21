package portlets;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.EmployeesDB.model.Bank;
import org.omg.CORBA.SystemException;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import com.EmployeesDB.service.BankLocalServiceUtil;


public class BankPortlet extends MVCPortlet {
    public void addBank(ActionRequest request, ActionResponse response) throws SystemException{

        try {
            Bank newBank;
            newBank = BankLocalServiceUtil.createBank(CounterLocalServiceUtil.increment(Bank.class.getName()));
            newBank.setAdres(request.getParameter("adres"));
            newBank.setBankName(request.getParameter("name"));
            newBank.setBik(request.getParameter("bik"));
            BankLocalServiceUtil.updateBank(newBank);
        } catch (com.liferay.portal.kernel.exception.SystemException e) {
            e.printStackTrace();
        }
    }

    public void editBank(ActionRequest request, ActionResponse response) {
        Bank edit = null;
        try {
            edit = BankLocalServiceUtil.getBank( ParamUtil.getLong(request, "id") );
            edit.setAdres(request.getParameter("adres"));
            edit.setBik(request.getParameter("bik"));
            BankLocalServiceUtil.updateBank(edit);
        } catch (PortalException e) {
            e.printStackTrace();
        } catch (com.liferay.portal.kernel.exception.SystemException e) {
            e.printStackTrace();
        }
    }

    public void delBank(ActionRequest request, ActionResponse response) throws SystemException{
        try {
            BankLocalServiceUtil.deleteBank(ParamUtil.getLong(request, "id"));
        } catch (PortalException e) {
            e.printStackTrace();
        } catch (com.liferay.portal.kernel.exception.SystemException e) {
            e.printStackTrace();
        }
    }
}
