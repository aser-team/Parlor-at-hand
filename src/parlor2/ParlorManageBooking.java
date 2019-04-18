package parlor2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class ParlorManageBooking
{
    
private int bookingID;
private String ParlorName;
private String ServiceName;
private String Price;
private String DateAndTime;
private String BookStatus;
private String BStatus;
        public ParlorManageBooking(int bookingID,String ParlorName,String ServiceName,String Price,String DateAndTime,String BookStatus)
        {
            this.ParlorName=ParlorName;
            this.ServiceName=ServiceName;
            this.Price=Price;
            this.DateAndTime=DateAndTime;
            this.BookStatus=BookStatus;
            this.bookingID=bookingID;
        }
        public int getBookingId()
        {
            return bookingID;
        }
        public String getParlorName()
        {
            return  ParlorName;
        }
        public String getServiceName()
        {
            return ServiceName;
        }
        public String getPrice()
        {
            return Price;
        }
        public String getDateandTime()
        {
            return DateAndTime;
        }
        public String getBookStatus()
        {
            return BookStatus;
        }
    
}
