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

/**
 * <i>INTERNAL USE ONLY</i>
 */
public class OptionPricingMCRFactory
{
   
    
    /** Component's uuid */
    private static final String sComponentId = "OptionPricin_1E756EE45EE1DEC9E853630933AC4625";
    
    /** Component name */
    private static final String sComponentName = "OptionPricing";
    
   
    /** Pointer to default component options */
    private static final MWComponentOptions sDefaultComponentOptions = 
        new MWComponentOptions(
            MWCtfExtractLocation.EXTRACT_TO_CACHE, 
            new MWCtfClassLoaderSource(OptionPricingMCRFactory.class)
        );
    
    
    private OptionPricingMCRFactory()
    {
        // Never called.
    }
    
    public static MWMCR newInstance(MWComponentOptions componentOptions) throws MWException
    {
        if (null == componentOptions.getCtfSource()) {
            componentOptions = new MWComponentOptions(componentOptions);
            componentOptions.setCtfSource(sDefaultComponentOptions.getCtfSource());
        }
        return MWMCR.newInstance(
            componentOptions, 
            OptionPricingMCRFactory.class, 
            sComponentName, 
            sComponentId,
            new int[]{8,1,0}
        );
    }
    
    public static MWMCR newInstance() throws MWException
    {
        return newInstance(sDefaultComponentOptions);
    }
}
