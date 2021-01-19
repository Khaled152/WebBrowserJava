package sample;

import javafx.scene.control.TextField;

public class Tab {

        private String URL;
        private TextField txt = new TextField();
        static int NumberOfTabs = 0;
        Tab(){
            NumberOfTabs ++;
        }
        Tab(String url , History history){
            NumberOfTabs++;
            //URL = txt.getText();
            //url = this.URL;
            URL = url;
            history.add(url);
        }

        public String getURL() {
            URL = txt.getText();
            return URL;
        }
        public void setURL(String url , TextField text){
            text.setText(txt.getText());
        }
        public int getNumberOfTab(){
            return this.NumberOfTabs;
        }
}
