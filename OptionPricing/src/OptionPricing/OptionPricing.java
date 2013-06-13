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

import com.mathworks.toolbox.javabuilder.*;
import com.mathworks.toolbox.javabuilder.internal.*;
import java.util.*;

/**
 * The <code>OptionPricing</code> class provides a Java interface to the M-functions
 * from the files:
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
 * The {@link #dispose} method <b>must</b> be called on a <code>OptionPricing</code> 
 * instance when it is no longer needed to ensure that native resources allocated by this 
 * class are properly freed.
 * @version 0.0
 */
public class OptionPricing extends MWComponentInstance<OptionPricing>
{
    /**
     * Tracks all instances of this class to ensure their dispose method is
     * called on shutdown.
     */
    private static final Set<Disposable> sInstances = new HashSet<Disposable>();

    /**
     * Maintains information used in calling the <code>american_call_baw</code> 
     *M-function.
     */
    private static final MWFunctionSignature sAmerican_call_bawSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "american_call_baw",
                                /* max inputs = */ 7,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>american_call_bin</code> 
     *M-function.
     */
    private static final MWFunctionSignature sAmerican_call_binSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "american_call_bin",
                                /* max inputs = */ 6,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>american_call_bin_contpay</code> 
     *M-function.
     */
    private static final MWFunctionSignature sAmerican_call_bin_contpaySignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "american_call_bin_contpay",
                                /* max inputs = */ 7,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>american_call_bin_partials</code> 
     *M-function.
     */
    private static final MWFunctionSignature sAmerican_call_bin_partialsSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "american_call_bin_partials",
                                /* max inputs = */ 6,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>american_call_bin_propdiv</code> 
     *M-function.
     */
    private static final MWFunctionSignature sAmerican_call_bin_propdivSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "american_call_bin_propdiv",
                                /* max inputs = */ 8,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the 
     *<code>american_call_bjerkesun_stensland</code> M-function.
     */
    private static final MWFunctionSignature sAmerican_call_bjerkesun_stenslandSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "american_call_bjerkesun_stensland",
                                /* max inputs = */ 6,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>american_call_futures_bin</code> 
     *M-function.
     */
    private static final MWFunctionSignature sAmerican_call_futures_binSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "american_call_futures_bin",
                                /* max inputs = */ 6,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the 
     *<code>american_call_futures_currcy_bin</code> M-function.
     */
    private static final MWFunctionSignature sAmerican_call_futures_currcy_binSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "american_call_futures_currcy_bin",
                                /* max inputs = */ 7,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>american_call_onediv</code> 
     *M-function.
     */
    private static final MWFunctionSignature sAmerican_call_onedivSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "american_call_onediv",
                                /* max inputs = */ 7,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>american_call_perpetual</code> 
     *M-function.
     */
    private static final MWFunctionSignature sAmerican_call_perpetualSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "american_call_perpetual",
                                /* max inputs = */ 5,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>american_put_bin</code> M-function.
     */
    private static final MWFunctionSignature sAmerican_put_binSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "american_put_bin",
                                /* max inputs = */ 6,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>american_put_johnson</code> 
     *M-function.
     */
    private static final MWFunctionSignature sAmerican_put_johnsonSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "american_put_johnson",
                                /* max inputs = */ 5,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>asian_geom_avg_call</code> 
     *M-function.
     */
    private static final MWFunctionSignature sAsian_geom_avg_callSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "asian_geom_avg_call",
                                /* max inputs = */ 6,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>bermudan_put_bin</code> M-function.
     */
    private static final MWFunctionSignature sBermudan_put_binSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "bermudan_put_bin",
                                /* max inputs = */ 8,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>bs_call_partials</code> M-function.
     */
    private static final MWFunctionSignature sBs_call_partialsSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "bs_call_partials",
                                /* max inputs = */ 5,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>bs_european_call</code> M-function.
     */
    private static final MWFunctionSignature sBs_european_callSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "bs_european_call",
                                /* max inputs = */ 5,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>bs_european_put</code> M-function.
     */
    private static final MWFunctionSignature sBs_european_putSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "bs_european_put",
                                /* max inputs = */ 5,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>european_call_bin</code> 
     *M-function.
     */
    private static final MWFunctionSignature sEuropean_call_binSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "european_call_bin",
                                /* max inputs = */ 6,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>european_call_contpay</code> 
     *M-function.
     */
    private static final MWFunctionSignature sEuropean_call_contpaySignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "european_call_contpay",
                                /* max inputs = */ 6,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>european_call_div</code> 
     *M-function.
     */
    private static final MWFunctionSignature sEuropean_call_divSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "european_call_div",
                                /* max inputs = */ 7,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>european_call_futures</code> 
     *M-function.
     */
    private static final MWFunctionSignature sEuropean_call_futuresSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "european_call_futures",
                                /* max inputs = */ 5,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the 
     *<code>european_call_futures_currcy</code> M-function.
     */
    private static final MWFunctionSignature sEuropean_call_futures_currcySignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "european_call_futures_currcy",
                                /* max inputs = */ 6,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>european_call_loopback</code> 
     *M-function.
     */
    private static final MWFunctionSignature sEuropean_call_loopbackSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "european_call_loopback",
                                /* max inputs = */ 6,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>european_call_merton</code> 
     *M-function.
     */
    private static final MWFunctionSignature sEuropean_call_mertonSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "european_call_merton",
                                /* max inputs = */ 9,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>example</code> M-function.
     */
    private static final MWFunctionSignature sExampleSignature =
        new MWFunctionSignature(/* max outputs = */ 0,
                                /* has varargout = */ false,
                                /* function name = */ "example",
                                /* max inputs = */ 0,
                                /* has varargin = */ false);

    /**
     * Shared initialization implementation - private
     */
    private OptionPricing (final MWMCR mcr) throws MWException
    {
        super(mcr);
        // add this to sInstances
        synchronized(OptionPricing.class) {
            sInstances.add(this);
        }
    }

    /**
     * Constructs a new instance of the <code>OptionPricing</code> class.
     */
    public OptionPricing() throws MWException
    {
        this(OptionPricingMCRFactory.newInstance());
    }
    
    private static MWComponentOptions getPathToComponentOptions(String path)
    {
        MWComponentOptions options = new MWComponentOptions(new MWCtfExtractLocation(path),
                                                            new MWCtfDirectorySource(path));
        return options;
    }
    
    /**
     * @deprecated Please use the constructor {@link #OptionPricing(MWComponentOptions componentOptions)}.
     * The <code>com.mathworks.toolbox.javabuilder.MWComponentOptions</code> class provides API to set the
     * path to the component.
     * @param pathToComponent Path to component directory.
     */
    public OptionPricing(String pathToComponent) throws MWException
    {
        this(OptionPricingMCRFactory.newInstance(getPathToComponentOptions(pathToComponent)));
    }
    
    /**
     * Constructs a new instance of the <code>OptionPricing</code> class. Use this 
     * constructor to specify the options required to instantiate this component.  The 
     * options will be specific to the instance of this component being created.
     * @param componentOptions Options specific to the component.
     */
    public OptionPricing(MWComponentOptions componentOptions) throws MWException
    {
        this(OptionPricingMCRFactory.newInstance(componentOptions));
    }
    
    /** Frees native resources associated with this object */
    public void dispose()
    {
        try {
            super.dispose();
        } finally {
            synchronized(OptionPricing.class) {
                sInstances.remove(this);
            }
        }
    }
  
    /**
     * Invokes the first m-function specified by MCC, with any arguments given on
     * the command line, and prints the result.
     */
    public static void main (String[] args)
    {
        try {
            MWMCR mcr = OptionPricingMCRFactory.newInstance();
            mcr.runMain( sAmerican_call_bawSignature, args);
            mcr.dispose();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
    
    /**
     * Calls dispose method for each outstanding instance of this class.
     */
    public static void disposeAllInstances()
    {
        synchronized(OptionPricing.class) {
            for (Disposable i : sInstances) i.dispose();
            sInstances.clear();
        }
    }

    /**
     * Provides the interface for calling the <code>american_call_baw</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void american_call_baw(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sAmerican_call_bawSignature);
    }

    /**
     * Provides the interface for calling the <code>american_call_baw</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void american_call_baw(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sAmerican_call_bawSignature);
    }

    /**
     * Provides the standard interface for calling the <code>american_call_baw</code>
     * M-function with 7 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] american_call_baw(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sAmerican_call_bawSignature), 
                    sAmerican_call_bawSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>american_call_bin</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void american_call_bin(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sAmerican_call_binSignature);
    }

    /**
     * Provides the interface for calling the <code>american_call_bin</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void american_call_bin(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sAmerican_call_binSignature);
    }

    /**
     * Provides the standard interface for calling the <code>american_call_bin</code>
     * M-function with 6 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] american_call_bin(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sAmerican_call_binSignature), 
                    sAmerican_call_binSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>american_call_bin_contpay</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void american_call_bin_contpay(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sAmerican_call_bin_contpaySignature);
    }

    /**
     * Provides the interface for calling the <code>american_call_bin_contpay</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void american_call_bin_contpay(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sAmerican_call_bin_contpaySignature);
    }

    /**
     * Provides the standard interface for calling the <code>american_call_bin_contpay</code>
     * M-function with 7 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] american_call_bin_contpay(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sAmerican_call_bin_contpaySignature), 
                    sAmerican_call_bin_contpaySignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>american_call_bin_partials</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void american_call_bin_partials(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sAmerican_call_bin_partialsSignature);
    }

    /**
     * Provides the interface for calling the <code>american_call_bin_partials</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void american_call_bin_partials(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sAmerican_call_bin_partialsSignature);
    }

    /**
     * Provides the standard interface for calling the <code>american_call_bin_partials</code>
     * M-function with 6 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] american_call_bin_partials(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sAmerican_call_bin_partialsSignature), 
                    sAmerican_call_bin_partialsSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>american_call_bin_propdiv</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void american_call_bin_propdiv(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sAmerican_call_bin_propdivSignature);
    }

    /**
     * Provides the interface for calling the <code>american_call_bin_propdiv</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void american_call_bin_propdiv(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sAmerican_call_bin_propdivSignature);
    }

    /**
     * Provides the standard interface for calling the <code>american_call_bin_propdiv</code>
     * M-function with 8 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] american_call_bin_propdiv(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sAmerican_call_bin_propdivSignature), 
                    sAmerican_call_bin_propdivSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>american_call_bjerkesun_stensland</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void american_call_bjerkesun_stensland(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sAmerican_call_bjerkesun_stenslandSignature);
    }

    /**
     * Provides the interface for calling the <code>american_call_bjerkesun_stensland</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void american_call_bjerkesun_stensland(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sAmerican_call_bjerkesun_stenslandSignature);
    }

    /**
     * Provides the standard interface for calling the <code>american_call_bjerkesun_stensland</code>
     * M-function with 6 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] american_call_bjerkesun_stensland(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sAmerican_call_bjerkesun_stenslandSignature), 
                    sAmerican_call_bjerkesun_stenslandSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>american_call_futures_bin</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void american_call_futures_bin(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sAmerican_call_futures_binSignature);
    }

    /**
     * Provides the interface for calling the <code>american_call_futures_bin</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void american_call_futures_bin(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sAmerican_call_futures_binSignature);
    }

    /**
     * Provides the standard interface for calling the <code>american_call_futures_bin</code>
     * M-function with 6 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] american_call_futures_bin(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sAmerican_call_futures_binSignature), 
                    sAmerican_call_futures_binSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>american_call_futures_currcy_bin</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void american_call_futures_currcy_bin(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sAmerican_call_futures_currcy_binSignature);
    }

    /**
     * Provides the interface for calling the <code>american_call_futures_currcy_bin</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void american_call_futures_currcy_bin(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sAmerican_call_futures_currcy_binSignature);
    }

    /**
     * Provides the standard interface for calling the <code>american_call_futures_currcy_bin</code>
     * M-function with 7 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] american_call_futures_currcy_bin(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sAmerican_call_futures_currcy_binSignature), 
                    sAmerican_call_futures_currcy_binSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>american_call_onediv</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void american_call_onediv(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sAmerican_call_onedivSignature);
    }

    /**
     * Provides the interface for calling the <code>american_call_onediv</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void american_call_onediv(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sAmerican_call_onedivSignature);
    }

    /**
     * Provides the standard interface for calling the <code>american_call_onediv</code>
     * M-function with 7 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] american_call_onediv(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sAmerican_call_onedivSignature), 
                    sAmerican_call_onedivSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>american_call_perpetual</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void american_call_perpetual(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sAmerican_call_perpetualSignature);
    }

    /**
     * Provides the interface for calling the <code>american_call_perpetual</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void american_call_perpetual(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sAmerican_call_perpetualSignature);
    }

    /**
     * Provides the standard interface for calling the <code>american_call_perpetual</code>
     * M-function with 5 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] american_call_perpetual(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sAmerican_call_perpetualSignature), 
                    sAmerican_call_perpetualSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>american_put_bin</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void american_put_bin(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sAmerican_put_binSignature);
    }

    /**
     * Provides the interface for calling the <code>american_put_bin</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void american_put_bin(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sAmerican_put_binSignature);
    }

    /**
     * Provides the standard interface for calling the <code>american_put_bin</code>
     * M-function with 6 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] american_put_bin(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sAmerican_put_binSignature), 
                    sAmerican_put_binSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>american_put_johnson</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void american_put_johnson(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sAmerican_put_johnsonSignature);
    }

    /**
     * Provides the interface for calling the <code>american_put_johnson</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void american_put_johnson(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sAmerican_put_johnsonSignature);
    }

    /**
     * Provides the standard interface for calling the <code>american_put_johnson</code>
     * M-function with 5 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] american_put_johnson(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sAmerican_put_johnsonSignature), 
                    sAmerican_put_johnsonSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>asian_geom_avg_call</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void asian_geom_avg_call(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sAsian_geom_avg_callSignature);
    }

    /**
     * Provides the interface for calling the <code>asian_geom_avg_call</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void asian_geom_avg_call(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sAsian_geom_avg_callSignature);
    }

    /**
     * Provides the standard interface for calling the <code>asian_geom_avg_call</code>
     * M-function with 6 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] asian_geom_avg_call(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sAsian_geom_avg_callSignature), 
                    sAsian_geom_avg_callSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>bermudan_put_bin</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void bermudan_put_bin(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sBermudan_put_binSignature);
    }

    /**
     * Provides the interface for calling the <code>bermudan_put_bin</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void bermudan_put_bin(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sBermudan_put_binSignature);
    }

    /**
     * Provides the standard interface for calling the <code>bermudan_put_bin</code>
     * M-function with 8 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] bermudan_put_bin(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sBermudan_put_binSignature), 
                    sBermudan_put_binSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>bs_call_partials</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void bs_call_partials(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sBs_call_partialsSignature);
    }

    /**
     * Provides the interface for calling the <code>bs_call_partials</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void bs_call_partials(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sBs_call_partialsSignature);
    }

    /**
     * Provides the standard interface for calling the <code>bs_call_partials</code>
     * M-function with 5 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] bs_call_partials(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sBs_call_partialsSignature), 
                    sBs_call_partialsSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>bs_european_call</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void bs_european_call(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sBs_european_callSignature);
    }

    /**
     * Provides the interface for calling the <code>bs_european_call</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void bs_european_call(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sBs_european_callSignature);
    }

    /**
     * Provides the standard interface for calling the <code>bs_european_call</code>
     * M-function with 5 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] bs_european_call(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sBs_european_callSignature), 
                    sBs_european_callSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>bs_european_put</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void bs_european_put(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sBs_european_putSignature);
    }

    /**
     * Provides the interface for calling the <code>bs_european_put</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void bs_european_put(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sBs_european_putSignature);
    }

    /**
     * Provides the standard interface for calling the <code>bs_european_put</code>
     * M-function with 5 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] bs_european_put(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sBs_european_putSignature), 
                    sBs_european_putSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>european_call_bin</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void european_call_bin(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sEuropean_call_binSignature);
    }

    /**
     * Provides the interface for calling the <code>european_call_bin</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void european_call_bin(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sEuropean_call_binSignature);
    }

    /**
     * Provides the standard interface for calling the <code>european_call_bin</code>
     * M-function with 6 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] european_call_bin(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sEuropean_call_binSignature), 
                    sEuropean_call_binSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>european_call_contpay</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void european_call_contpay(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sEuropean_call_contpaySignature);
    }

    /**
     * Provides the interface for calling the <code>european_call_contpay</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void european_call_contpay(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sEuropean_call_contpaySignature);
    }

    /**
     * Provides the standard interface for calling the <code>european_call_contpay</code>
     * M-function with 6 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] european_call_contpay(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sEuropean_call_contpaySignature), 
                    sEuropean_call_contpaySignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>european_call_div</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void european_call_div(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sEuropean_call_divSignature);
    }

    /**
     * Provides the interface for calling the <code>european_call_div</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void european_call_div(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sEuropean_call_divSignature);
    }

    /**
     * Provides the standard interface for calling the <code>european_call_div</code>
     * M-function with 7 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] european_call_div(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sEuropean_call_divSignature), 
                    sEuropean_call_divSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>european_call_futures</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void european_call_futures(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sEuropean_call_futuresSignature);
    }

    /**
     * Provides the interface for calling the <code>european_call_futures</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void european_call_futures(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sEuropean_call_futuresSignature);
    }

    /**
     * Provides the standard interface for calling the <code>european_call_futures</code>
     * M-function with 5 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] european_call_futures(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sEuropean_call_futuresSignature), 
                    sEuropean_call_futuresSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>european_call_futures_currcy</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void european_call_futures_currcy(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sEuropean_call_futures_currcySignature);
    }

    /**
     * Provides the interface for calling the <code>european_call_futures_currcy</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void european_call_futures_currcy(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sEuropean_call_futures_currcySignature);
    }

    /**
     * Provides the standard interface for calling the <code>european_call_futures_currcy</code>
     * M-function with 6 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] european_call_futures_currcy(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sEuropean_call_futures_currcySignature), 
                    sEuropean_call_futures_currcySignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>european_call_loopback</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void european_call_loopback(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sEuropean_call_loopbackSignature);
    }

    /**
     * Provides the interface for calling the <code>european_call_loopback</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void european_call_loopback(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sEuropean_call_loopbackSignature);
    }

    /**
     * Provides the standard interface for calling the <code>european_call_loopback</code>
     * M-function with 6 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] european_call_loopback(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sEuropean_call_loopbackSignature), 
                    sEuropean_call_loopbackSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>european_call_merton</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void european_call_merton(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sEuropean_call_mertonSignature);
    }

    /**
     * Provides the interface for calling the <code>european_call_merton</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void european_call_merton(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sEuropean_call_mertonSignature);
    }

    /**
     * Provides the standard interface for calling the <code>european_call_merton</code>
     * M-function with 9 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
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
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] european_call_merton(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sEuropean_call_mertonSignature), 
                    sEuropean_call_mertonSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>example</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * %--------------------------------------------------------------------------
     * % Barone-Adesi and Whaley (1987) quadratic approximation to the price 
     * % of a call option.
     * </pre>
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void example(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sExampleSignature);
    }

    /**
     * Provides the interface for calling the <code>example</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * %--------------------------------------------------------------------------
     * % Barone-Adesi and Whaley (1987) quadratic approximation to the price 
     * % of a call option.
     * </pre>
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void example(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sExampleSignature);
    }

    /**
     * Provides the standard interface for calling the <code>example</code>
     * M-function with 0 input argument.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * %--------------------------------------------------------------------------
     * % Barone-Adesi and Whaley (1987) quadratic approximation to the price 
     * % of a call option.
     * </pre>
     * </p>
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] example(Object... rhs) throws MWException
    {
        Object[] lhs = new Object[0];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sExampleSignature), 
                    sExampleSignature);
        return lhs;
    }
}
