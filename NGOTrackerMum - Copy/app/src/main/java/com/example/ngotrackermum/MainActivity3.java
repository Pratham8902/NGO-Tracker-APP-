package com.example.ngotrackermum;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity3 extends AppCompatActivity
{
    private TextView textView;
    private TextView textview2;

    //String[] name = new String[50];
    //String[] cause = new String[50];
    //String[] number = new String[50];
    //String[] address = new String[50];

    String name[] = {"Anupam kher foundation","st catherines home","mukti foundation","kacharadaan foundation","ymca","yuva ekta foundation","mumbai nadar sakthi","tarang life care foundation","green world trust","narmada kidney foundation","fight hunger foundation","mother foundation right base ngo","national anti corruption and crime preventive council","sahayta for helping people","DESIRE Society","Community Development Centre","KEEP HOPE ALIVE FOUNDATION","Abhilasha Foundation NGO","Upasana Society NGO","SUMATI GRAM HUMAN RIGHTS PROTECTION FORUM","Suryodaya Seva Sanstha","Cancare Research Foundation","Kaynaat Welfare Trust","We Can We Will Foundation","Parivartan Foundation","Garbage Concern Welfare Society","Sadguru Foundation","Bright Future Kandivali East Centre","Dakkhan Yuva Prathishthan","a  Man Foundation","HUMAN INSANIYAT FOUNDATION","Debo Rescue Foundation","Child vision And Education","JEEVAN SAHARA CHARITABLE TRUST","Tiny Miracles Foundation","Narayan Seva Sansthan","Aarambh India","Indian Development Foundation (IDF)","Arpan","Helping Hand","GuideStar India","Progressive Foundation","NAVYUVAK LOKSEVA PRATHISTHAN","Vivekananda Youth Forum","Arpan","Raichel Joseph Foundation","smile foundation","JAGRUT a Social Organization","Rajani Foundation India","SNEHA Mumbai","The Akshaya Patra Foundation","Advitya","Umang Foundation Trust","Seva Sahayog Foundation","Society Undertaking poor people's onus for Rehabilation"};
    String number[] = {"7419873708","022 26766906","9920555550","2242662666","022 263030776","9773727217","9920663664","9820737739","9820019315","9322256573","9819775009","8454907029","9821973096","9821848769","095051 17777","(022) 2889 1025","085075 67890","097699 86440","097697 27057","098674 99812","098692 25234","093222 99795","095941 37120","090043 55972","022 2867 8518","022 3225 6427","083559 92909","070457 90122","098705 53397","098196 40008","098333 04756","022 2890 1890","2228482370","098693 34558","090821 22614","0294 662 2222","098922 10066","022 2876 2008","022 2686 2444","090225 69309","022 2685 6900","","099201 93278","098333 02122","022 2686 2444","098210 35469","022 2610 4106","083840 12345","098700 72491","022 2661 4488","097406 81749","098208 44415","091676 24687","022 2618 9779","022 2665 2904"};
    String address[] = {"D53/1137, Veera Desai Road, Andheri West, Mumbai - 400058, Azad Nagar","St Catherines Home, Veera Desai Road, Andheri West, Mumbai - 400058, Near Police Chowky","Mukti culural Park, 141 A, Model Town 4 bunglows, Andheri West, Mumbai - 400053, Behind Kokilaben Dhirubhai Ambani Hospital","35, 1st Floor, Chandragupta Estate, New Link Road, Andheri West, Mumbai - 400053, Next To Samsung Showroom, Opposite City Mall & Koyla Restaurant","Link Road, Andheri West, Mumbai - 400053, Near D N Nagar Police Station, D N Nagar, Near Barfiwala Bus Stop","gav devi dongri, koja jamat khana, Andheri West, Mumbai - 400058, near noor masjid","10, Marol Pipeline Road, Sai Nagar, J B Nagar, Andheri East, Mumbai - 400059","C/O Kush Infosystems Pvt Ltd, 24 Nand Deep Industrial Estate, Kondivita Road, Andheri East, Mumbai - 400059, Opp Vits Hotel","523/ 524, 5th Floor, Midas, Sahar Plaza, J. B. Nagar, Andheri ( E), Jb Nagar-Andheri East, Mumbai - 400059","B/01, Ground Floor, NAV Sanyukta Co-Operative Society Ltd, A G Link Road, Chakala-andheri East, Mumbai - 400093, Behind JAI Mata Di Temple,Dr Charat Singh Colony","C/O Accelya Kale Solutions Limited, 201, 2nd Floor, Akruti Trade Center, 7th Road, Andheri East, Mumbai - 400093, MIDC","Shah Arcade Compund II, Rani Sati Marg, Malad East, Mumbai - 400097, Hiro Showroom, Near Wasten Exp Highway","Building No B 3, Flat No 1 Mahindra Nagar, D P Road, Malad East, Mumbai - 400097, Opposite Mahindra School, Near Govind Nagar Municipal Hospital,Malad (East)","109, First Floor, Building No 9, C and D Wing, Rani Sati Marg, Malad East, Mumbai - 400097, Opposite Wadari Pada","Kingston Complex, Bungalow No, 3, Chincholi Bunder Rd, Chincholi Bunder, Malad West, Mumbai, Maharashtra 400064","Lutheran Centre, Marve Rd, Malad, Adarsh Nagar, Malad West, Mumbai, Maharashtra 400064","5RP8+G6M, Malad, Azad Nagar, Malvani, Malad West, Mumbai, Maharashtra 400095","Laxmi Chhaya Bungalow, Plot No. 27-27, RSC 11, Gorai 2, Borivali West, Mumbai, Maharashtra 400091","Pranay Nagar CHS, Pranay Nagar, Koliwada, Vazira, Borivali West, Mumbai, Maharashtra 400091","1, Prerana CHS, Gorai 1, Borivali West, Borivali (West), Maharashtra 400091","Sai Vihar Coperative Housing Society, 1/10, Devipada, Borivali East, Mumbai, Maharashtra 400066","Shreeji Shopping Center, Shop No.27, Ground Floor, M.G. road, Borivali(East), near G.H.School, Mumbai, Maharashtra 400066","Room No. 86, Ganesh Nagar, Tata Power, Opp. Lizzat Papad Company, Borivali (E), Mumbai, Maharashtra 400066","Plot No /193 Ratna Ganga Bunglow, next to Oxford School, Sector 5 Charkop, Kandivali West, Mumbai, Maharashtra 400067","Parera House, Opp. Pooja Enclave Bldg. Old Link Road, Ganesh Nagar,, Kandivali We, Mumbai, Maharashtra 400067","501/502, Royal Apartments, Sector-3, Charkop, Kandivali(W), Mumbai, Maharashtra 400067","Office :60, centrum shopping centre Lokhandwala Township, Akurli Rd, Kandivali(E, Mumbai, Maharashtra 400101","A-16, 1st Floor, Dattani Center Above Sandip Hotel, Near Kandivali East Station, Kandivali East, Mumbai, Maharashtra 400101","5VW7+GWM, Kandivali, Hanuman Nagar, Kandivali East, Mumbai, Maharashtra 400101","17, Raja Apartments, Mhatre Wadi, Dahisar West., Mumbai, Maharashtra 400068","Dr. Mascarenhas Wadi, LM Road, Kandarpada, near Hanuman Temple, Navagaon, Dahisar West, Mumbai, 400068","No. 4, Shreenath Bhuvan, Yashwntrao, Rajaram Tawde Rd, Dahisar (W, Mumbai, Maharashtra 400068","Off No.23, C Wing,N.G Park, Rawalpada, Dahisar East, Mumbai, Maharashtra 400068","B-24/302, Chhatrapati Shivaji Rd, Anand Nagar, Dahisar East, Mumbai, Maharashtra 400068","104, 1st Floor, Scarlett Home, New Ekta Co.Op Housing, Dahisar Bus Station Check, Naka Dahisar, Maharashtra 400068","F1/3, HARI NIKETAN SOCIETY, CHS LTD. OPP. BASANT 1 GALAXY, GOREGAON, WEST MUMBAI, Maharashtra 400063","101, Acme Industrial Park, Service Rd, Jay Prakash Nagar, Goregaon, Mumbai, Maharashtra 400063","L 10/3 & 4 Jal Ratan Deep CHS, New Link Rd, Bangur Nagar, Goregaon West, Mumbai, Maharashtra 400104","Arpan House, Delta Chemicals Pvt Ltd., J-1 Off. Val Bhatt Rd, Cama Industrial Estate, Goregaon, Mumbai, Maharashtra 400063","Satellite Royale, Film City Road, Goregaon East, Mumbai, Maharashtra 400063","108, D-Definity, Road Number 1, Jay Prakash Nagar, Goregaon East, Mumbai, Maharashtra 400063","4B, 401, Link Road, Patliputra Nagar, Jogeshwari W, Mumbai, Maharashtra 400102","9/14, Ram Naresh Chawl, Ram Nagar, Behram Baug, Jogeshwari(W), Mumbai, Maharashtra 400120","Vivekananda Youth Forum, 19-D, Firdaus, N.S. Road No.: 4, JVPD Scheme, Vile Parle (W), Mumbai, Maharashtra 400056","Vithalbhai Patel Rd, Pond Gaothan, Navpada, Kamala Nagar, Vile Parle, Mumbai, Maharashtra 400056","24, Sangeet, 6th N. S. Road, JVPD Scheme Vile Parle (W, Juhu, Mumbai, Maharashtra 400056","Building, 101, First Floor, Gladiola, Hanuman Rd, Vile Parle East, Mumbai, Maharashtra 400057","agrut Compound, Azad Rd, Vile Parle, Mumbai, Maharashtra","121 Hari Niwas, Veer Makrand Ghanekar Road,, Vile Parle east, Mumbai, Maharashtra 400057","BMC Colony, behind Bldg. No. 11, Shastri Nagar, Santacruz West, Mumbai, Maharashtra 400054","DHEERAJ HERITAGE, 203, Swami Vivekananda Rd, Santacruz (W, Mumbai, Maharashtra 400064","Bungalow No. J/18, M.R.Colony, Opp. Raheja College, STY Relief Rd, Santacruz West, Mumbai, Maharashtra 400054","LEGEND APARTMENT-1, Office No. 2, St Anthony Rd, behind St. Anthony Church, Vakola, Santacruz East, Mumbai, Maharashtra 400055","Maharshi Dadhichi Charitable Hospital, Rd Number 3, Sen Nagar, Santacruz East, Mumbai, Maharashtra 400055","Manthan Plaza, 3rd floor, Vakola Market, Nehru Road, Santacruz (East), Mumbai, Maharashtra 400055"};
    String website[]={"http://www.anupamkherfoundation.org/","http://www.stcatherineshome.org/","http://www.muktifoundation.org/","http://www.kacharadaan.com/","http://www.ymcabombay.com/","Not Available","http://mumbainadarsakthi.com/","http://www.tarang.org/","Not Available","http://www.narmadakidney.org/","http://www.fighthungerfoundation.org/","http://motherfoudnation.org.com/","http://www.naccpc.com/","Not Available","https://desiresociety.org/Default/Pages/Default.aspx","http://www.cdc-ielc.org/","https://keephopealivefoundation.org/","https://www.abhilasha-foundation.org/","https://upasana-society-ngo.business.site/","Not Available","http://suryodayasevasanstha.org/","http://cancarefoundations.org/","http://kaynaatwelfaretrust.org/","https://wecanwewillfdn.org/","http://parivartanfoundationindia.com/","http://garbageconcernindia.org/","https://sadgurufoundation.com/","https://brightfutureindia.org/","Not Available","https://www.amanfoundation.xyz/index.htm","http://humaninsaniyatfoundation.co.in/","","https://www.childvisionandedu.org/","http://www.jeevansaharatrust.org/","https://www.tinymiracles.in/","https://www.narayanseva.org/","http://aarambhindia.org/","http://www.idf.org.in/","https://www.arpan.org.in/","https://helping-hands-non-governmental-organization.business.site/","https://guidestarindia.org.in/default.aspx","https://progressivengo.business.site/","","https://vyfngo.com/","https://www.arpan.org.in/","https://www.raicheljosephfoundation.org/","https://www.smilefoundationindia.org/","http://jagrutngo.org/","http://www.rajanifoundation.org/","http://www.snehamumbai.org/","https://www.akshayapatra.org/contact-us","http://www.advitya.com/","https://www.umangfoundationtrust.org/","http://www.sevasahayog.org/","http://supportstreetchildren.org/"};

    String name1[] = {"helpage india","Sahabhaav,","BHN Health Care","Little Sisters of the poor,","Aaimata care foundation","vaishnav samaj trust","stray happy animal foundation","animal angels foundation","being animal foundation ","World For All","World For All"};
    String number1[] = {"022 2637 0754","77770 79797","99208 33386","022 2836 4187","84548 72670"," "," ","098201 44621"," ","9820001506","9820008506"};
    String address1[] = {"34A/44, Guruchhaya, Manish Nagar, P. O. Azad Nagar, Near Dn Nagar Metro Station, Andheri West, Mumbai, Maharashtra 400053","Pump House, Nirman Vihar, Rajmata Jijabai Marg, Andheri East, Mumbai, Maharashtra 400093, India","Rishab Tower 701/ 801; Near Azad Nagar Metro Station Opp: Swadesh Restaurant, Andheri West, Mumbai, Maharashtra 400053","Mahakali Caves Road, Andheri East, Mumbai, Maharashtra 400093.","Row house bungalow no 38 rsc-1code, 98, Sector 8, Kandivali West, Mumbai, Maharashtra 400067","2, Motilal Nagar, MG Road, Goregaon West, Mumbai","Office Bldg NO 1, Room NO 3, Motilal Nagar, M G Road, Goregaon, Mumbai, Maharashtra 400104","Flat 11 Military Road Marol, Andheri, Mumbai 400059","Plot NO 7, Hatkesh CHS, East West Rdno-2 J V P D Scheme, Mumbai, Maharashtra 400056","Bandra","oppice no 28 opposite pmc bank andheri east mumbai-400093"};
    String website1[] = {"http://www.helpageindia.org/","Not Available","Not Available","Not Available","Not Available","Not Available","Not Available","http://animalangelsfoundation.com/","Not Available","www.worldforall.com","www.adoption@worldforall.co"};
    private Object SpannableString;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        String location = getIntent().getStringExtra("location");
        String cause = getIntent().getStringExtra("cause");
        textView = findViewById(R.id.textView);
        textview2 = findViewById(R.id.textView2);
        if(cause.equals("Choose cause"))
        {
            textView.setText("Results showing for "+location);
            switch(location)
            {
                case "Andheri":
                    for (int i = 0; i < 11; i++)
                    {
                        SpannableString string= new SpannableString(name[i]);
                        string.setSpan(new AbsoluteSizeSpan(18,true),0,string.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                        StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);
                        string.setSpan(boldSpan,0,string.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                        textview2.append(string);
                        //textview2.append(name[i] + "\n");
                        textview2.append("\nContact number: " + number[i] + "\n");
                        textview2.append("Address: " + address[i] + "\n");
                        textview2.append("Website: " + website[i] + "\n");
                        textview2.append("\n");
                    }
                    break;
                case "Malad":
                    for (int i = 11; i < 17; i++)
                    {
                        SpannableString string= new SpannableString(name[i]);
                        string.setSpan(new AbsoluteSizeSpan(18,true),0,string.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                        StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);
                        string.setSpan(boldSpan,0,string.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                        textview2.append(string);
                        //textview2.append(name[i] + "\n");
                        textview2.append("\nContact number: " + number[i] + "\n");
                        textview2.append("Address: " + address[i] + "\n");
                        SpannableString string1 = new SpannableString(website[i]);
                        string1.setSpan(new ForegroundColorSpan(Color.BLUE),0,string1.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                        //string1.(Color.parseColor("#2C1DFF"));
                        textview2.append("Website: " + website[i] + "\n");
                        textview2.append("\n");
                    }
                    break;
                case "Borivali":
                    for (int i = 17; i < 23; i++)
                    {
                        SpannableString string= new SpannableString(name[i]);
                        string.setSpan(new AbsoluteSizeSpan(18,true),0,string.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                        StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);
                        string.setSpan(boldSpan,0,string.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                        textview2.append(string);
                        //textview2.append(name[i] + "\n");
                        textview2.append("\nContact number: " + number[i] + "\n");
                        textview2.append("Address: " + address[i] + "\n");
                        textview2.append("Website: " + website[i] + "\n");
                        textview2.append("\n");
                    }
                    break;
                case "Kandivali":
                    for (int i = 23; i < 29; i++)
                    {
                        SpannableString string= new SpannableString(name[i]);
                        string.setSpan(new AbsoluteSizeSpan(18,true),0,string.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                        StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);
                        string.setSpan(boldSpan,0,string.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                        textview2.append(string);
                        //textview2.append(name[i] + "\n");
                        textview2.append("\nContact number: " + number[i] + "\n");
                        textview2.append("Address: " + address[i] + "\n");
                        textview2.append("Website: " + website[i] + "\n");
                        textview2.append("\n");
                    }
                    break;
                case "Dahisar":
                    for (int i = 29; i < 35; i++)
                    {
                        SpannableString string= new SpannableString(name[i]);
                        string.setSpan(new AbsoluteSizeSpan(18,true),0,string.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                        StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);
                        string.setSpan(boldSpan,0,string.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                        textview2.append(string);
                        //textview2.append(name[i] + "\n");
                        textview2.append("\nContact number: " + number[i] + "\n");
                        textview2.append("Address: " + address[i] + "\n");
                        textview2.append("Website: " + website[i] + "\n");
                        textview2.append("\n");
                    }
                    break;
                case "Goregaon":
                    for (int i = 35; i < 41; i++)
                    {
                        SpannableString string= new SpannableString(name[i]);
                        string.setSpan(new AbsoluteSizeSpan(18,true),0,string.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                        StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);
                        string.setSpan(boldSpan,0,string.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                        textview2.append(string);
                        //textview2.append(name[i] + "\n");
                        textview2.append("\nContact number: " + number[i] + "\n");
                        textview2.append("Address: " + address[i] + "\n");
                        textview2.append("Website: " + website[i] + "\n");
                        textview2.append("\n");
                    }
                    break;
                case "Jogeshwari":
                    for (int i = 41; i < 43; i++)
                    {
                        SpannableString string= new SpannableString(name[i]);
                        string.setSpan(new AbsoluteSizeSpan(18,true),0,string.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                        StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);
                        string.setSpan(boldSpan,0,string.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                        textview2.append(string);
                        //textview2.append(name[i] + "\n");
                        textview2.append("\nContact number: " + number[i] + "\n");
                        textview2.append("Address: " + address[i] + "\n");
                        textview2.append("Website: " + website[i] + "\n");
                        textview2.append("\n");
                    }
                    break;
                case "Vile Parle":
                    for (int i = 43; i < 49; i++)
                    {
                        SpannableString string= new SpannableString(name[i]);
                        string.setSpan(new AbsoluteSizeSpan(18,true),0,string.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                        StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);
                        string.setSpan(boldSpan,0,string.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                        textview2.append(string);
                        //textview2.append(name[i] + "\n");
                        textview2.append("\nContact number: " + number[i] + "\n");
                        textview2.append("Address: " + address[i] + "\n");
                        textview2.append("Website: " + website[i] + "\n");
                        textview2.append("\n");
                    }
                    break;
                case "Santacruz":
                    for (int i = 49; i < 55; i++)
                    {
                        SpannableString string= new SpannableString(name[i]);
                        string.setSpan(new AbsoluteSizeSpan(18,true),0,string.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                        StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);
                        string.setSpan(boldSpan,0,string.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                        textview2.append(string);
                        //textview2.append(name[i] + "\n");
                        textview2.append("\nContact number: " + number[i] + "\n");
                        textview2.append("Address: " + address[i] + "\n");
                        textview2.append("Website: " + website[i] + "\n");
                        textview2.append("\n");
                    }
                    break;
            }
        }
        else if(location.equals("Choose location"))
        {
            textView.setText("Results showing for "+cause);
            switch(cause)
            {
                case "Old age homes":
                    for (int i = 0; i < 5; i++) {
                        SpannableString string= new SpannableString(name[i]);
                        string.setSpan(new AbsoluteSizeSpan(18,true),0,string.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                        StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);
                        string.setSpan(boldSpan,0,string.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                        textview2.append(string);
                        //textview2.append(name1[i] + "\n");
                        textview2.append("\nContact number: " + number1[i] + "\n");
                        textview2.append("Address: " + address1[i] + "\n");
                        textview2.append("Website: " + website1[i] + "\n");
                        textview2.append("\n");
                    }
                    break;
                case "Animal welfare":
                    for (int i = 5; i < 11; i++) {
                        SpannableString string= new SpannableString(name[i]);
                        string.setSpan(new AbsoluteSizeSpan(18,true),0,string.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                        StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);
                        string.setSpan(boldSpan,0,string.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                        textview2.append(string);
                        //textview2.append(name1[i] + "\n");
                        textview2.append("\nContact number: " + number1[i] + "\n");
                        textview2.append("Address: " + address1[i] + "\n");
                        textview2.append("Website: " + website1[i] + "\n");
                        textview2.append("\n");
                    }
                    break;
                case "Child Education":
                    for (int i = 11; i < 17; i++) {
                        SpannableString string= new SpannableString(name[i]);
                        string.setSpan(new AbsoluteSizeSpan(18,true),0,string.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                        StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);
                        string.setSpan(boldSpan,0,string.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                        textview2.append(string);
                        //textview2.append(name1[i] + "\n");
                        textview2.append("\nContact number: " + number1[i] + "\n");
                        textview2.append("Address: " + address1[i] + "\n");
                        textview2.append("Website: " + website1[i] + "\n");
                        textview2.append("\n");
                    }
                    break;
                case "Women health and safety":
                    for (int i = 17; i < 28; i++) {
                        SpannableString string= new SpannableString(name[i]);
                        string.setSpan(new AbsoluteSizeSpan(18,true),0,string.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                        StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);
                        string.setSpan(boldSpan,0,string.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                        textview2.append(string);
                        //textview2.append(name1[i] + "\n");
                        textview2.append("\nContact number: " + number1[i] + "\n");
                        textview2.append("Address: " + address1[i] + "\n");
                        textview2.append("Website: " + website1[i] + "\n");
                        textview2.append("\n");
                    }
                    break;
                case "HIV/AI-DS awareness and help":
                    for (int i = 28; i < 34; i++) {
                        SpannableString string= new SpannableString(name[i]);
                        string.setSpan(new AbsoluteSizeSpan(18,true),0,string.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                        StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);
                        string.setSpan(boldSpan,0,string.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                        textview2.append(string);
                        //textview2.append(name1[i] + "\n");
                        textview2.append("\nContact number: " + number1[i] + "\n");
                        textview2.append("Address: " + address1[i] + "\n");
                        textview2.append("Website: " + website1[i] + "\n");
                        textview2.append("\n");
                    }
                    break;
                case "Cancer":
                    for (int i = 34; i < 39; i++) {
                        SpannableString string= new SpannableString(name[i]);
                        string.setSpan(new AbsoluteSizeSpan(18,true),0,string.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                        StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);
                        string.setSpan(boldSpan,0,string.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                        textview2.append(string);
                        //textview2.append(name1[i] + "\n");
                        textview2.append("\nContact number: " + number1[i] + "\n");
                        textview2.append("Address: " + address1[i] + "\n");
                        textview2.append("Website: " + website1[i] + "\n");
                        textview2.append("\n");
                    }
                    break;
                case "Disability and Physical challenged":
                    for (int i = 39; i < 44; i++) {
                        SpannableString string= new SpannableString(name[i]);
                        string.setSpan(new AbsoluteSizeSpan(18,true),0,string.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                        StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);
                        string.setSpan(boldSpan,0,string.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                        textview2.append(string);
                        //textview2.append(name1[i] + "\n");
                        textview2.append("\nContact number: " + number1[i] + "\n");
                        textview2.append("Address: " + address1[i] + "\n");
                        textview2.append("Website: " + website1[i] + "\n");
                        textview2.append("\n");
                    }
                    break;
                case "Homelessness":
                    for (int i = 44; i < 48; i++) {
                        SpannableString string= new SpannableString(name[i]);
                        string.setSpan(new AbsoluteSizeSpan(18,true),0,string.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                        StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);
                        string.setSpan(boldSpan,0,string.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                        textview2.append(string);
                        //textview2.append(name1[i] + "\n");
                        textview2.append("\nContact number: " + number1[i] + "\n");
                        textview2.append("Address: " + address1[i] + "\n");
                        textview2.append("Website: " + website1[i] + "\n");
                        textview2.append("\n");
                    }
                    break;
            }
        }
    }
}