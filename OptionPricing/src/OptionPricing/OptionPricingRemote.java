/*
 * MATLAB Compiler: 4.18.1 (R2013a)
 * Date: Wed Jun 12 23:04:36 2013
 * Arguments: "-B" "macro_default" "-W" "java:OptionPricing,OptionPricing" "-T" 
 * "link:lib" "-d" "/Users/Siren/Desktop/option_pricing_package/OptionPricing/src" "-w" 
 * "enable:specified_file_mismatch" "-w" "enable:repeated_file" "-w" 
 * "enable:switch_ignored" "-w" "enable:missing_lib_sentinel" "-w" "enable:demo_license" 
 * "-v" 
 * "class{OptionPricing:/Users/Siren/Desktop/option_pricing_package/american_call_baw.m,/Users/Siren/Desktop/option_pricing_package/american_call_bin.m,/Users/Siren/Desktop/option_pricing_package/american_call_bin_contpay.m,/Users/Siren/Desktop/option_pricing_package/american_call_bin_partials.m,/Users/Siren/Desktop/option_pricing_package/american_call_bin_propdiv.m,/Users/Siren/Desktop/option_pricing_package/american_call_bjerkesun_stensland.m,/Users/Siren/Desktop/option_pricing_package/american_call_futures_bin.m,/Users/Siren/Desktop/option_pricing_package/american_call_futures_currcy_bin.m,/Users/Siren/Desktop/option_pricing_package/american_call_onediv.m,/Users/Siren/Desktop/option_pricing_package/american_call_perpetual.m,/Users/Siren/Desktop/option_pricing_package/american_put_bin.m,/Users/Siren/Desktop/option_pricing_package/american_put_johnson.m,/Users/Siren/Desktop/option_pricing_package/asian_geom_avg_call.m,/Users/Siren/Desktop/option_pricing_package/bermudan_put_bin.m,/Users/Siren/Desktop/option_pricing_package/bs_call_partials.m,/Users/Siren/Desktop/option_pricing_package/bs_european_call.m,/Users/Siren/Desktop/option_pricing_package/bs_european_put.m,/Users/Siren/Desktop/option_pricing_package/european_call_bin.m,/Users/Siren/Desktop/option_pricing_package/european_call_contpay.m,/Users/Siren/Desktop/option_pricing_package/european_call_div.m,/Users/Siren/Desktop/option_pricing_package/european_call_futures.m,/Users/Siren/Desktop/option_pricing_package/european_call_futures_currcy.m,/Users/Siren/Desktop/option_pricing_package/european_call_loopback.m,/Users/Siren/Desktop/option_pricing_package/european_call_merton.m,/Users/Siren/Desktop/option_pricing_package/example.m}" 
 */

package OptionPricing;

import com.mathworks.toolbox.javabuilder.pooling.Poolable;
import java.util.List;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * The <code>OptionPricingRemote</code> class provides a Java RMI-compliant interface to 
 * the M-functions from the files:
 * <pre>
 *  /Users/Siren/Desktop/option_pricing_package/american_call_baw.m
 *  /Users/Siren/Desktop/option_pricing_package/american_call_bin.m
 *  /Users/Siren/Desktop/option_pricing_package/american_call_bin_contpay.m
 *  /Users/Siren/Desktop/option_pricing_package/american_call_bin_partials.m
 *  /Users/Siren/Desktop/option_pricing_package/american_call_bin_propdiv.m
 *  /Users/Siren/Desktop/option_pricing_package/american_call_bjerkesun_stensland.m
 *  /Users/Siren/Desktop/option_pricing_package/american_call_futures_bin.m
 *  /Users/Siren/Desktop/option_pricing_package/american_call_futures_currcy_bin.m
 *  /Users/Siren/Desktop/option_pricing_package/american_call_onediv.m
 *  /Users/Siren/Desktop/option_pricing_package/american_call_perpetual.m
 *  /Users/Siren/Desktop/option_pricing_package/american_put_bin.m
 *  /Users/Siren/Desktop/option_pricing_package/american_put_johnson.m
 *  /Users/Siren/Desktop/option_pricing_package/asian_geom_avg_call.m
 *  /Users/Siren/Desktop/option_pricing_package/bermudan_put_bin.m
 *  /Users/Siren/Desktop/option_pricing_package/bs_call_partials.m
 *  /Users/Siren/Desktop/option_pricing_package/bs_european_call.m
 *  /Users/Siren/Desktop/option_pricing_package/bs_european_put.m
 *  /Users/Siren/Desktop/option_pricing_package/european_call_bin.m
 *  /Users/Siren/Desktop/option_pricing_package/european_call_contpay.m
 *  /Users/Siren/Desktop/option_pricing_package/european_call_div.m
 *  /Users/Siren/Desktop/option_pricing_package/european_call_futures.m
 *  /Users/Siren/Desktop/option_pricing_package/european_call_futures_currcy.m
 *  /Users/Siren/Desktop/option_pricing_package/european_call_loopback.m
 *  /Users/Siren/Desktop/option_pricing_package/european_call_merton.m
 *  /Users/Siren/Desktop/option_pricing_package/example.m
 * </pre>
 * The {@link #dispose} method <b>must</b> be called on a 
 * <code>OptionPricingRemote</code> instance when it is no longer needed to ensure that 
 * native resources allocated by this class are properly freed, and the server-side proxy 
 * is unexported.  (Failure to call dispose may result in server-side threads not being 
 * properly shut down, which often appears as a hang.)  
 *
 * This interface is designed to be used together with 
 * <code>com.mathworks.toolbox.javabuilder.remoting.RemoteProxy</code> to automatically 
 * generate RMI server proxy objects for instances of OptionPricing.OptionPricing.
 */
public interface OptionPricingRemote extends Poolable
{
    /**
     * Provides the standard interface for calling the <code>american_call_baw</code> 
     * M-function with 7 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * %--------------------------------------------------------------------------
     * %
     * % DESCRIPTION:
     * %
     * % Barone-Adesi and Whaley (1987) quadratic approximation to the price 
     * % of a call option.
     * %
     * %
     * % Reference:
     * %
     * % Giovanni Barone-Adesi and Robert E. Whaley, 
     * % "Efficient analytic approximation of American option values", 
     * % Journal of Finance, 42(2):301-320, June 1987.
     * %
     * % 
     * %--------------------------------------------------------------------------
     * %
     * % INPUTS:
     * %
     * %   S:          spot price
     * %   X:          exercise price
     * %   r:          interest rate
     * %   b:          dividend yield
     * %   sigma:      volatility 
     * %   time:       time to maturity
     * %   accuracy:   approximation accuracy
     * %
     * %--------------------------------------------------------------------------
     * %
     * % OUTPUT:
     * %
     * % call_price: price of a call option
     * %
     * %--------------------------------------------------------------------------
     * %
     * % Author:  Paolo Z., February 2012
     * %
     * %--------------------------------------------------------------------------
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] american_call_baw(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>american_call_bin</code> 
     * M-function with 6 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * %--------------------------------------------------------------------------
     * %
     * % DESCRIPTION:
     * %
     * % Price of American call option using a binomial approximation
     * %
     * %
     * % Reference:
     * % 
     * % John Hull, "Options, Futures and other Derivative Securities",
     * % Prentice-Hall, second edition, 1993.
     * % 
     * %--------------------------------------------------------------------------
     * %
     * % INPUTS:
     * %
     * %  S:       spot price
     * %  K:       exercice price
     * %  r:       interest rate
     * %  sigma:   volatility
     * %  t:       time to maturity
     * %  steps:   number of steps in binomial tree
     * %
     * %--------------------------------------------------------------------------
     * %
     * % OUTPUT:
     * %
     * % call_price: price of a call option
     * %
     * %--------------------------------------------------------------------------
     * %
     * % Author:  Paolo Z., February 2012
     * %
     * %--------------------------------------------------------------------------
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] american_call_bin(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the 
     * <code>american_call_bin_contpay</code> M-function with 7 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * %--------------------------------------------------------------------------
     * %
     * % DESCRIPTION:
     * %
     * % Binomial option price with continous payout from the underlying commodity
     * %
     * %
     * % Reference:
     * %
     * % John Hull, "Options, Futures and other Derivative Securities",
     * % Prentice-Hall, second edition, 1993.
     * % 
     * %--------------------------------------------------------------------------
     * %
     * % INPUTS:
     * %
     * %  S:       spot price
     * %  K:       exercice price
     * %  r:       interest rate
     * %  y:       continous payout
     * %  sigma:   volatility
     * %  t:       time to maturity
     * %  steps:   number of steps in binomial tree
     * %
     * %--------------------------------------------------------------------------
     * %
     * % OUTPUT:
     * %
     * % call_price: price of a call option
     * %
     * %--------------------------------------------------------------------------
     * %
     * % Author:  Paolo Z., February 2012
     * %
     * %--------------------------------------------------------------------------
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] american_call_bin_contpay(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the 
     * <code>american_call_bin_partials</code> M-function with 6 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * %--------------------------------------------------------------------------
     * %
     * % DESCRIPTION:
     * %
     * % Hedge parameters for an American call option using a binomial tree
     * %
     * %
     * % Reference:
     * %
     * % John Hull, "Options, Futures and other Derivative Securities",
     * % Prentice-Hall, second edition, 1993.
     * %
     * %--------------------------------------------------------------------------
     * %
     * % INPUTS:
     * %
     * % S:        spot price
     * % K:        exercise price
     * % r:        interest rate
     * % sigma:    volatility
     * % time:     time to maturity
     * % no_steps: number of steps in binomial tree
     * %
     * %--------------------------------------------------------------------------
     * %
     * % OUTPUT:
     * %
     * % hedge.delta: partial with respect to S
     * % hedge.gamma: second artial with respect to S
     * % hedge.theta: partial with respect to time
     * % hedge.vega:  partial with respect to sigma
     * % hedge.rho:   partial with respect to r
     * %
     * %--------------------------------------------------------------------------
     * %
     * % Author:  Paolo Z., February 2012
     * %
     * %--------------------------------------------------------------------------
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] american_call_bin_partials(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the 
     * <code>american_call_bin_propdiv</code> M-function with 8 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * %--------------------------------------------------------------------------
     * %
     * % DESCRIPTION:
     * %
     * % Binomial price of stock option with an underlying stock that 
     * % pays proportional dividends
     * %
     * %
     * % Reference:
     * %
     * % John Hull, "Options, Futures and other Derivative Securities",
     * % Prentice-Hall, second edition, 1993.
     * % 
     * %--------------------------------------------------------------------------
     * %
     * % INPUTS:
     * %
     * %  S:                spot price
     * %  K:                exercice price
     * %  r:                interest rate
     * %  sigma:            volatility
     * %  time:             time_to_maturity
     * %  no_steps:         number of steps in binomial tree
     * %  dividend_times:   periods when dividend is paid out
     * %  dividend_yields:  dividend yields in each period
     * %
     * %--------------------------------------------------------------------------
     * %
     * % OUTPUT:
     * %
     * % call_price: price of a call option
     * %
     * %--------------------------------------------------------------------------
     * %
     * % Author:  Paolo Z., February 2012
     * %
     * %--------------------------------------------------------------------------
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] american_call_bin_propdiv(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the 
     * <code>american_call_bjerkesun_stensland</code> M-function with 6 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * %--------------------------------------------------------------------------
     * %
     * % DESCRIPTION:
     * %
     * % Approximation of American call due to Bjerksund and Stensland (1993)
     * %
     * %
     * % Reference:
     * % 
     * % Petter Bjerksund and Gunnar Stensland,  
     * % "Closed form approximations of american options", 
     * % Scandinavian Journal of Management, 20(5):761-764, 1993.
     * %
     * %--------------------------------------------------------------------------
     * %
     * % INPUTS:
     * %
     * %  S:       spot price
     * %  K:       exercice price
     * %  r:       interest rate
     * %  b:       dividend yield
     * %  sigma:   volatility
     * %  T:       time to maturity
     * %
     * % This function uses phi1.m
     * %
     * %--------------------------------------------------------------------------
     * %
     * % OUTPUT:
     * %
     * % call_price: price of a call option
     * %
     * %--------------------------------------------------------------------------
     * %
     * % Author:  Paolo Z., February 2012
     * %
     * %--------------------------------------------------------------------------
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] american_call_bjerkesun_stensland(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the 
     * <code>american_call_futures_bin</code> M-function with 6 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * %--------------------------------------------------------------------------
     * %
     * % DESCRIPTION:
     * %
     * % Pricing an american call option on futures using a binomial approximation
     * %
     * %
     * % Reference:
     * % 
     * % John Hull, "Options, Futures and other Derivative Securities",
     * % Prentice-Hall, second edition, 1993.
     * % 
     * %--------------------------------------------------------------------------
     * %
     * % INPUTS:
     * %
     * % F:        price futures contract
     * % K:        exercise price
     * % r:        interest rate
     * % sigma:    volatility
     * % time:     time to maturity
     * % no_steps: number of steps in binomial tree
     * %
     * %--------------------------------------------------------------------------
     * %
     * % OUTPUT:
     * %
     * % call_price: price of a call option
     * %
     * %--------------------------------------------------------------------------
     * %
     * % Author:  Paolo Z., February 2012
     * %
     * %--------------------------------------------------------------------------
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] american_call_futures_bin(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the 
     * <code>american_call_futures_currcy_bin</code> M-function with 7 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * %--------------------------------------------------------------------------
     * %
     * % DESCRIPTION:
     * %
     * % Pricing a futures currency option using a binomial approximation
     * %
     * %
     * % Reference:
     * %
     * % John Hull, "Options, Futures and other Derivative Securities",
     * % Prentice-Hall, second edition, 1993.
     * % 
     * %--------------------------------------------------------------------------
     * %
     * % INPUTS:
     * %
     * %  S:           spot price
     * %  K:           exercice price
     * %  r:           domestic interest rate
     * %  r_f:         foreign interest rate
     * %  sigma:       volatility
     * %  time:        time to maturity
     * %  no_steps:    number of steps in binomial tree
     * %
     * %--------------------------------------------------------------------------
     * %
     * % OUTPUT:
     * %
     * % call_price: price of a call option
     * %
     * %--------------------------------------------------------------------------
     * %
     * % Author:  Paolo Z., February 2012
     * %
     * %--------------------------------------------------------------------------
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] american_call_futures_currcy_bin(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>american_call_onediv</code> 
     * M-function with 7 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * %--------------------------------------------------------------------------
     * %
     * % DESCRIPTION:
     * %
     * % Roll (1977) - Geske (1979) - Whaley (1981) price of american call option 
     * % on a stock that pays one fixed-dividend
     * %
     * %
     * % Reference:
     * %
     * % John Hull, "Options, Futures and other Derivative Securities",
     * % Prentice-Hall, second edition, 1993.
     * % 
     * %--------------------------------------------------------------------------
     * %
     * % INPUTS:
     * %
     * %  S:           spot price
     * %  K:           exercice price
     * %  r:           domestic interest rate
     * %  sigma:       volatility
     * %  tau:         time to maturity
     * %  D1:          amount of dividend paid
     * %  tau1:        time to dividend payment
     * %
     * %--------------------------------------------------------------------------
     * %
     * % OUTPUT:
     * %
     * % call_price: price of a call option
     * %
     * %--------------------------------------------------------------------------
     * %
     * % Author:  Paolo Z., February 2012
     * %
     * %--------------------------------------------------------------------------
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] american_call_onediv(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the 
     * <code>american_call_perpetual</code> M-function with 5 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * %--------------------------------------------------------------------------
     * %
     * % DESCRIPTION:
     * %
     * % Price for an american perpetual call option
     * %
     * %
     * % Reference:
     * %
     * % John Hull, "Options, Futures and other Derivative Securities",
     * % Prentice-Hall, second edition, 1993.
     * % 
     * %--------------------------------------------------------------------------
     * %
     * % INPUTS:
     * %
     * %  S:       spot price
     * %  K:       exercice price
     * %  r:       interest rate
     * %  q:       dividend yield 
     * %  sigma:   volatility
     * %
     * %--------------------------------------------------------------------------
     * %
     * % OUTPUT:
     * %
     * % call_price: price of a call option
     * %
     * %--------------------------------------------------------------------------
     * %
     * % Author:  Paolo Z., February 2012
     * %
     * %--------------------------------------------------------------------------
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] american_call_perpetual(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>american_put_bin</code> 
     * M-function with 6 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * %--------------------------------------------------------------------------
     * %
     * % DESCRIPTION:
     * %
     * % Price of American put using a binomial approximation
     * %
     * %
     * % Reference:
     * %
     * % John Hull, "Options, Futures and other Derivative Securities",
     * % Prentice-Hall, second edition, 1993.
     * % 
     * %--------------------------------------------------------------------------
     * %
     * % INPUTS:
     * %
     * %  S:       spot price
     * %  K:       exercice price
     * %  r:       interest rate
     * %  sigma:   volatility
     * %  t:       time to maturity
     * %  steps:   number of steps in binomial tree
     * %
     * %--------------------------------------------------------------------------
     * %
     * % OUTPUT:
     * %
     * % call_price: price of a put option
     * %
     * %--------------------------------------------------------------------------
     * %
     * % Author:  Paolo Z., February 2012
     * %
     * %--------------------------------------------------------------------------
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] american_put_bin(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>american_put_johnson</code> 
     * M-function with 5 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * %--------------------------------------------------------------------------
     * %
     * % DESCRIPTION:
     * %
     * % Johnson (1983) approximation to an american put price
     * %
     * %
     * % Reference:
     * %
     * % H. E. Johnson, 
     * % "An analytic approximation of the american put price", 
     * % Journal of Financial and Quantitative Analysis, 18(1):141-48, 1983.
     * % 
     * %--------------------------------------------------------------------------
     * %
     * % INPUTS:
     * %
     * %  S:       spot price
     * %  X:       exercise price
     * %  r:       interest rate
     * %  sigma:   volatility
     * %  time:    time to maturity
     * %
     * %--------------------------------------------------------------------------
     * %
     * % OUTPUT:
     * %
     * % put_price: price of a put option
     * %
     * %--------------------------------------------------------------------------
     * %
     * % Author:  Paolo Z., February 2012
     * %
     * %--------------------------------------------------------------------------
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] american_put_johnson(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>asian_geom_avg_call</code> 
     * M-function with 6 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * %--------------------------------------------------------------------------
     * %
     * % DESCRIPTION:
     * %
     * % Analytical price of an Asian geometric average price call by Kemma and
     * % Vorst (1990)
     * %
     * %
     * % Reference:
     * %
     * % John Hull, "Options, Futures and other Derivative Securities",
     * % Prentice-Hall, second edition, 1993.
     * % 
     * %--------------------------------------------------------------------------
     * %
     * % INPUTS:
     * %
     * %  S:       spot price
     * %  K:       exercice price
     * %  r:       interest rate
     * %  q:       dividend yield
     * %  sigma:   volatility
     * %  time:    time to maturity
     * %
     * %--------------------------------------------------------------------------
     * %
     * % OUTPUT:
     * %
     * % call_price: price of a call option
     * %
     * %--------------------------------------------------------------------------
     * %
     * % Author:  Paolo Z., February 2012
     * %
     * %--------------------------------------------------------------------------
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] asian_geom_avg_call(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>bermudan_put_bin</code> 
     * M-function with 8 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * %--------------------------------------------------------------------------
     * %
     * % DESCRIPTION:
     * %
     * % Binomial approximation to a Bermudan put option
     * %
     * %
     * % Reference:
     * %
     * % John Hull, "Options, Futures and other Derivative Securities",
     * % Prentice-Hall, second edition, 1993.
     * % 
     * %--------------------------------------------------------------------------
     * %
     * % INPUTS:
     * %
     * %  S:                           spot price
     * %  X:                           exercise price
     * %  r:                           interest rate
     * %  q:                           dividend yield 
     * %  sigma:                       volatility
     * %  time:                        time to maturity
     * %  potential_exercise_times:    periods of potential option exercise
     * %  steps:                       number of steps in binomial tree
     * %
     * %--------------------------------------------------------------------------
     * %
     * % OUTPUT:
     * %
     * % call_price: price of a call option
     * %
     * %--------------------------------------------------------------------------
     * %
     * % Author:  Paolo Z., February 2012
     * %
     * %--------------------------------------------------------------------------
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] bermudan_put_bin(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>bs_call_partials</code> 
     * M-function with 5 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * %--------------------------------------------------------------------------
     * %
     * % DESCRIPTION:
     * %
     * % Partials of a European call option priced using Black-Scholes formula
     * %
     * %
     * % Reference:
     * %
     * % John Hull, "Options, Futures and other Derivative Securities",
     * % Prentice-Hall, second edition, 1993.
     * % 
     * %--------------------------------------------------------------------------
     * %
     * % INPUTS:
     * %
     * % S:     spot price
     * % K:     Strike (exercise) price,
     * % r:     interest rate
     * % sigma: volatility
     * % time:  time to maturity
     * %
     * %--------------------------------------------------------------------------
     * %
     * % OUTPUT:
     * %
     * % hedge.Delta: partial with respect to S
     * % hedge.Gamma: second partial derivative with respect to S
     * % hedge.Theta: partial with respect to time
     * % hedge.Vega:  partial with respect to sigma
     * % hedge.Rho:   partial with respect to r
     * %
     * %--------------------------------------------------------------------------
     * %
     * % Author:  Paolo Z., February 2012
     * %
     * %--------------------------------------------------------------------------
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] bs_call_partials(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>bs_european_call</code> 
     * M-function with 5 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * %--------------------------------------------------------------------------
     * %
     * % DESCRIPTION:
     * %
     * % European put option using Black-Scholes' formula
     * %
     * %
     * % Reference:
     * %
     * % John Hull, "Options, Futures and other Derivative Securities",
     * % Prentice-Hall, second edition, 1993.
     * %
     * %--------------------------------------------------------------------------
     * %
     * % INPUTS:
     * %
     * %   S:      spot price
     * %   K:      strike price
     * %   r:      interest rate
     * %   sigma:  volatility
     * %   time:   time to maturity
     * %
     * %--------------------------------------------------------------------------
     * %
     * % OUTPUT:
     * %
     * % call_price: price of a call option
     * %
     * %--------------------------------------------------------------------------
     * %
     * % Author:  Paolo Z., February 2012
     * %
     * %--------------------------------------------------------------------------
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] bs_european_call(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>bs_european_put</code> 
     * M-function with 5 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * %--------------------------------------------------------------------------
     * %
     * % DESCRIPTION:
     * %
     * % European put option using Black-Scholes' formula
     * %
     * %
     * % Reference:
     * %
     * % John Hull, "Options, Futures and other Derivative Securities",
     * % Prentice-Hall, second edition, 1993.
     * % 
     * %--------------------------------------------------------------------------
     * %
     * % INPUTS:
     * %
     * %   S:      spot price
     * %   K:      exercise price
     * %   r:      interest rate
     * %   sigma:  volatility
     * %   time:   time to maturity
     * %
     * %--------------------------------------------------------------------------
     * %
     * % OUTPUT:
     * %
     * % put_price: price of a put option
     * %
     * %--------------------------------------------------------------------------
     * %
     * % Author:  Paolo Z., February 2012
     * %
     * %--------------------------------------------------------------------------
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] bs_european_put(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>european_call_bin</code> 
     * M-function with 6 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * %--------------------------------------------------------------------------
     * %
     * % DESCRIPTION:
     * %
     * % Call option price for binomial european
     * %
     * %
     * % Reference:
     * %
     * % John Hull, "Options, Futures and other Derivative Securities",
     * % Prentice-Hall, second edition, 1993.
     * % 
     * %--------------------------------------------------------------------------
     * %
     * % INPUTS:
     * %
     * % S:     spot price
     * % K:     exercice price
     * % r:     interest rate
     * % sigma: volatility
     * % t:     time to maturity
     * % steps: number of steps in binomial tree
     * %
     * %--------------------------------------------------------------------------
     * %
     * % OUTPUT:
     * %
     * % call_price: price of a call option
     * %
     * %--------------------------------------------------------------------------
     * %
     * % Author:  Paolo Z., February 2012
     * %
     * %--------------------------------------------------------------------------
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] european_call_bin(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>european_call_contpay</code> 
     * M-function with 6 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * %--------------------------------------------------------------------------
     * %
     * % DESCRIPTION:
     * %
     * % Option price with continous payout from underlying asset
     * %
     * %
     * % Reference:
     * %
     * % 
     * %--------------------------------------------------------------------------
     * %
     * % INPUTS:
     * %
     * % S:     spot price
     * % X:     strike (exercise) price
     * % r:     interest rate
     * % q:     yield on underlying
     * % sigma: volatility
     * % time:  time to maturity
     * %
     * %--------------------------------------------------------------------------
     * %
     * % OUTPUT:
     * %
     * % call_price: price of a call option
     * %
     * %--------------------------------------------------------------------------
     * %
     * % Author:  Paolo Z., February 2012
     * %
     * %--------------------------------------------------------------------------
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] european_call_contpay(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>european_call_div</code> 
     * M-function with 7 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * %--------------------------------------------------------------------------
     * %
     * % DESCRIPTION:
     * %
     * % European option price with an underlying stock paying a discrete-time
     * % dividend 
     * %
     * %
     * % Reference:
     * %
     * % John Hull, "Options, Futures and other Derivative Securities",
     * % Prentice-Hall, second edition, 1993.
     * % 
     * %--------------------------------------------------------------------------
     * %
     * % INPUTS:
     * %
     * %  S:                   spot price
     * %  K:                   exercice price
     * %  r:                   interest rate
     * %  y:                   continous payout
     * %  sigma:               volatility
     * %  time_to_maturity:    time to maturity
     * %  dividend_times:      periods of dividend payment
     * %  dividend_amounts:    amounts of dividend payment 
     * %
     * %--------------------------------------------------------------------------
     * %
     * % OUTPUT:
     * %
     * % call_price: price of a call option
     * %
     * %--------------------------------------------------------------------------
     * %
     * % Author:  Paolo Z., February 2012
     * %
     * %--------------------------------------------------------------------------
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] european_call_div(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>european_call_futures</code> 
     * M-function with 5 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * %--------------------------------------------------------------------------
     * %
     * % DESCRIPTION:
     * %
     * % Price of European call option on futures contract
     * %
     * %
     * % Reference:
     * %
     * % John Hull, "Options, Futures and other Derivative Securities",
     * % Prentice-Hall, second edition, 1993.
     * % 
     * %--------------------------------------------------------------------------
     * %
     * % INPUTS:
     * %
     * % F:     futures price
     * % K:     exercise price
     * % r:     interest rate
     * % sigma: volatility
     * % time:  time to maturity
     * %
     * %--------------------------------------------------------------------------
     * %
     * % OUTPUT:
     * %
     * % call_price: price of a call option
     * %
     * %--------------------------------------------------------------------------
     * %
     * % Author:  Paolo Z., February 2012
     * %
     * %--------------------------------------------------------------------------
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] european_call_futures(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the 
     * <code>european_call_futures_currcy</code> M-function with 6 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * %--------------------------------------------------------------------------
     * %
     * % DESCRIPTION:
     * %
     * % European futures call option on currency
     * %
     * %
     * % Reference:
     * %
     * % John Hull, "Options, Futures and other Derivative Securities",
     * % Prentice-Hall, second edition, 1993.
     * % 
     * %--------------------------------------------------------------------------
     * %
     * % INPUTS:
     * %
     * % S:     exchange rate
     * % X:     exercise
     * % r:     domestic interest rate
     * % r_f:   foreign interest rate
     * % sigma: volatility
     * % time:  time to maturity
     * %
     * %--------------------------------------------------------------------------
     * %
     * % OUTPUT:
     * %
     * % call_price: price of a call option
     * %
     * %--------------------------------------------------------------------------
     * %
     * % Author:  Paolo Z., February 2012
     * %
     * %--------------------------------------------------------------------------
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] european_call_futures_currcy(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the 
     * <code>european_call_loopback</code> M-function with 6 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * %--------------------------------------------------------------------------
     * %
     * % DESCRIPTION:
     * %
     * % Price of a European lookback call option by Goldman, Sosin and Gatto (1979)
     * %
     * %
     * % Reference:
     * %
     * % M Barry Goldman, Howard B Sosin and Mary Ann Gatto,
     * % "Path-dependent options: Buy at the low, sell at the high",
     * % Journal of Finance, 34, December 1979.
     * % 
     * %--------------------------------------------------------------------------
     * %
     * % INPUTS:
     * %
     * % S:        spot price
     * % Smin:     minimum spot price
     * % r:        interest rate
     * % q:        dividend yield
     * % sigma:    volatility
     * % time:     time to maturity
     * %
     * %--------------------------------------------------------------------------
     * %
     * % OUTPUT:
     * %
     * % call_price: price of a call option
     * %
     * %--------------------------------------------------------------------------
     * %
     * % Author:  Paolo Z., February 2012
     * %
     * %--------------------------------------------------------------------------
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] european_call_loopback(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>european_call_merton</code> 
     * M-function with 9 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * %--------------------------------------------------------------------------
     * %
     * % DESCRIPTION:
     * %
     * % Merton (1976) jump diffusion formula for a European call option
     * %
     * %
     * % Reference:
     * % Robert C. Merton, 
     * % "Option pricing when underlying stock returns are discontinous", 
     * % Journal of Financial Economics, 3:125-144, 1976.
     * % 
     * %--------------------------------------------------------------------------
     * %
     * % INPUTS:
     * %
     * %  S:                spot price
     * %  X:                exercise price
     * %  r:                interest rate
     * %  sigma:            volatility
     * %  time_to_maturity: time to maturity
     * %  lambda:           parameter of the jump distribution
     * %  kappa:            parameter of the jump distribution
     * %  delta:            parameter used to normalize volatility
     * %  maxn:             terminal point of the infinite sum used in the
     * %                       approximation of the option price
     * %
     * %--------------------------------------------------------------------------
     * %
     * % OUTPUT:
     * %
     * % call_price: price of a call option
     * %
     * %--------------------------------------------------------------------------
     * %
     * % Author:  Paolo Z., February 2012
     * %
     * %--------------------------------------------------------------------------
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] european_call_merton(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>example</code> M-function 
     * with 0 input argument.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * %--------------------------------------------------------------------------
     * % Barone-Adesi and Whaley (1987) quadratic approximation to the price 
     * % of a call option.
     * </pre>
     *
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] example(Object... rhs) throws RemoteException;
  
    /** Frees native resources associated with the remote server object */
    void dispose() throws RemoteException;
}
