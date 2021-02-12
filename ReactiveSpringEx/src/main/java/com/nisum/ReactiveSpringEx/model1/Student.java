package com.nisum.ReactiveSpringEx.model1;


	import org.springframework.data.annotation.Id;
	import org.springframework.data.mongodb.core.mapping.Document;

	import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
	import lombok.NoArgsConstructor;
	import lombok.Setter;
import lombok.ToString;
	
	@Document
	public
	class Student {
		@Id
		private String id;
		private  String name;
	    private long Fee;

	public Student(String id, String name, long fee) {
			super();
			this.id = id;
			this.name = name;
			this.Fee = fee;
		}
	public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public long getFee() {
			return Fee;
		}
		public void setFee(long fee) {
			this.Fee = fee;
		}

		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
			public String toString() {
				return "Student [id=" + id + ", name=" + name + ", Fee=" + Fee + "]";
			}
}
