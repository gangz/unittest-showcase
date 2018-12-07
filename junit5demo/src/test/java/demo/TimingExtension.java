package demo;

import java.lang.reflect.Method;
import java.util.Optional;
import java.util.logging.Logger;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ExtensionContext.Namespace;
import org.junit.jupiter.api.extension.ExtensionContext.Store;
import org.junit.jupiter.api.extension.TestExtensionContext;

public class TimingExtension implements BeforeTestExecutionCallback, AfterTestExecutionCallback {
	private static final Logger logger = Logger.getLogger(TimingExtension.class.getName());
	private static final String START_TIME = "start time";

	private Store getStore(ExtensionContext context) {
		return context.getStore(Namespace.create(getClass(), context.getTestMethod()));
	}

	@Override
	public void afterTestExecution(TestExtensionContext context) throws Exception {
		Optional<Method> testMethod = context.getTestMethod();
		long startTime = getStore(context).remove(START_TIME, long.class);
		long duration = System.currentTimeMillis() - startTime;
		if (testMethod.isPresent())
			logger.info(() -> String.format("Method [%s] took %s ms.", testMethod.get().getName(), duration));
	}

	@Override
	public void beforeTestExecution(TestExtensionContext context) throws Exception {
		getStore(context).put(START_TIME, System.currentTimeMillis());

	}
}