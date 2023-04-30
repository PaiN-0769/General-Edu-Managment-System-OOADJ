package com.cedm.app.mongo.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;


public abstract class phoneDetails {
		@Id
		private String id;
        private String phoneType;
        private String extension;
        private Integer phoneNumber;

        public String getPhoneType() {
            return phoneType;
        }

        public void setPhoneType(String phoneType) {
            this.phoneType = phoneType;
        }

        public String getExtension() {
            return extension;
        }

		public Integer getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(Integer phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
}