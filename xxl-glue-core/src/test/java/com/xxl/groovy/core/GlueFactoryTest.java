package com.xxl.groovy.core;

public class GlueFactoryTest {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		GlueFactory glueFactory = new GlueFactory();
		glueFactory.setGlueLoader(new GlueLoader() {
			@Override
			public String load(String name) {
				String classCode = "package com.xxl.groovy.core;"+
					"public class DemoImpl implements IDemo {"+
						"public int add(int a, int b) {"+
							"return a + b;"+
						"}"+
					"}"+
					";";
				return classCode;
			}
		});
		
		@SuppressWarnings("unchecked")
		Class<IDemo> clazz = (Class<IDemo>) glueFactory.loadClass("ssssss");
		
		IDemo service = clazz.newInstance();
		System.out.println(service);
		System.out.println(service.add(1, 1));
	}
}

