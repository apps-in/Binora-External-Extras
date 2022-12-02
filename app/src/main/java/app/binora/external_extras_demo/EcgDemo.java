package app.binora.external_extras_demo;

import android.content.Context;
import android.content.Intent;

import app.binora.external_extras.ExternalActions;
import app.binora.external_extras.ExternalExtras;

public class EcgDemo {

    public static Intent getExternalEcgIntent(){
        Intent intent = new Intent(ExternalActions.GET_ECG_ACTION);

        /*
        ECG input mode
        Value type: string constant
        Possible values:
        -> ExternalExtras.HUMAN_MODE_EXTRA_VALUE
        -> ExternalExtras.INTERNAL_TEST_MODE_EXTRA_VALUE
        -> ExternalExtras.SIMULATOR_MODE_EXTRA_VALUE
        Default value: ExternalExtras.HUMAN_MODE_EXTRA_VALUE
        */
        intent.putExtra(ExternalExtras.EXTRA_ECG_MODE, ExternalExtras.HUMAN_MODE_EXTRA_VALUE);

        /*
        ECG power line filter
        Value type: string constant
        Possible values:
        -> ExternalExtras.POWER_LINE_FILTER_NONE_EXTRA_VALUE
        -> ExternalExtras.POWER_LINE_FILTER_50_HZ_EXTRA_VALUE
        -> ExternalExtras.POWER_LINE_FILTER_60_HZ_EXTRA_VALUE
        Default value: ExternalExtras.POWER_LINE_FILTER_NONE_EXTRA_VALUE
        */
        intent.putExtra(ExternalExtras.EXTRA_ECG_POWER_LINE_FILTER, ExternalExtras.POWER_LINE_FILTER_50_HZ_EXTRA_VALUE);

        /*
        Sound state during ECG input
        Value type: boolean
        Possible values:
        -> true - sound is on
        -> false - sound is off
        Default value: true
        */
        intent.putExtra(ExternalExtras.EXTRA_SOUND_STATE, true);

        /*
        Volume sound in percents
        Value type: integer
        Range: from 0 to 100
        Default value: 75
         */
        intent.putExtra(ExternalExtras.EXTRA_VOLUME, 75);

        /*
        Ecg record duration in seconds
        Value type: integer
        Range: from 10 to 100
        Default value: 60
         */
        intent.putExtra(ExternalExtras.EXTRA_MAX_DURATION, 60);

        /*
        Initial ECG chart amplitude scale
        Value type: string constant
        Possible values:
        -> SCALE_SMALL_EXTRA_VALUE - 2.5 mm/mV
        -> SCALE_MEDIUM_EXTRA_VALUE - 5.0 mm/mV
        -> SCALE_LARGE_EXTRA_VALUE - 10.0 mm/mV
        Default value: SCALE_SMALL_EXTRA_VALUE
         */
        intent.putExtra(ExternalExtras.EXTRA_AMPLITUDE_SCALE, ExternalExtras.SCALE_SMALL_EXTRA_VALUE);

        /*
        Initial ECG time scale
        Value type: string constant
        Possible values:
        -> SCALE_SMALL_EXTRA_VALUE - 12.5 mm/s
        -> SCALE_LARGE_EXTRA_VALUE - 25.0 mm/s
        Default value: SCALE_SMALL_EXTRA_VALUE
         */
        intent.putExtra(ExternalExtras.EXTRA_TIME_SCALE, ExternalExtras.SCALE_SMALL_EXTRA_VALUE);

        /*
        Report grid color
        Value type: string constant
        Possible values:
        -> REPORT_GRID_GREEN_EXTRA_VALUE - Green
        -> REPORT_GRID_BLUE_EXTRA_VALUE - Blue
        -> REPORT_GRID_YELLOW_EXTRA_VALUE - Yellow
        Default value: REPORT_GRID_GREEN_EXTRA_VALUE
         */
        intent.putExtra(ExternalExtras.EXTRA_REPORT_GRID_COLOR, ExternalExtras.REPORT_GRID_GREEN_EXTRA_VALUE);

        /*
        Language
        Value type: string constant
        Possible values:
        -> null - Binora App settings
        -> EN_LANGUAGE_EXTRA_VALUE - English
        -> RU_LANGUAGE_EXTRA_VALUE - Russian
        -> UK_LANGUAGE_EXTRA_VALUE - Ukrainian
        Default value: null
         */
        intent.putExtra(ExternalExtras.EXTRA_LANGUAGE, ExternalExtras.EN_LANGUAGE_EXTRA_VALUE);

        /*
        Color theme
        Value type: string constant
        Possible values:
        -> null - Binora App settings
        -> LIGHT_THEME_EXTRA_VALUE - Light
        -> DARK_THEME_EXTRA_VALUE - Dark
        Default value: null
         */
        intent.putExtra(ExternalExtras.EXTRA_THEME, ExternalExtras.LIGHT_THEME_EXTRA_VALUE);

        /*
        Patient age - number of full years
        Value type: integer
        Default value: 0
         */
        intent.putExtra(ExternalExtras.EXTRA_PATIENT_AGE_YEARS, 30);

        /*
        Patient age - number of full months in current year
        Value type: integer
        Default value: 0
         */
        intent.putExtra(ExternalExtras.EXTRA_PATIENT_AGE_MONTHS, 5);

        /*
        Patient age - number of full days in current month
        Value type: integer
        Default value: 0
         */
        intent.putExtra(ExternalExtras.EXTRA_PATIENT_AGE_DAYS, 10);

        /*
        Patient gender
        Value type: string constant
        Possible values:
        -> null - Undefined
        -> MALE_GENDER_EXTRA_VALUE - Male
        -> FEMALE_GENDER_EXTRA_VALUE - Female
        Default value: null
         */
        intent.putExtra(ExternalExtras.EXTRA_PATIENT_GENDER, ExternalExtras.FEMALE_GENDER_EXTRA_VALUE);

        /*
        Patient height in selected height units
        Value type: double
        Default value: 0.0
         */
        intent.putExtra(ExternalExtras.EXTRA_PATIENT_HEIGHT, 178.5);

        /*
        Height units for patient height
        Value type: string constant
        Possible values:
        -> CM_HEIGHT_UNITS_EXTRA_VALUE - Centimeters
        -> INCH_HEIGHT_UNITS_EXTRA_VALUE - Inches
        -> FEET_HEIGHT_UNITS_EXTRA_VALUE - Feet
        Default value: CM_HEIGHT_UNITS_EXTRA_VALUE
         */
        intent.putExtra(ExternalExtras.EXTRA_PATIENT_HEIGHT_UNITS, ExternalExtras.CM_HEIGHT_UNITS_EXTRA_VALUE);

        /*
        Patient weight in selected weight units
        Value type: double
        Default value: 0.0
         */
        intent.putExtra(ExternalExtras.EXTRA_PATIENT_WEIGHT, 72.4);

        /*
        Weight units for patient weight
        Value type: string constant
        Possible values:
        -> G_WEIGHT_UNITS_EXTRA_VALUE - Grams
        -> KG_WEIGHT_UNITS_EXTRA_VALUE - Kilograms
        -> POUNDS_WEIGHT_UNITS_EXTRA_VALUE - Pounds
        Default value: KG_WEIGHT_UNITS_EXTRA_VALUE
         */
        intent.putExtra(ExternalExtras.EXTRA_PATIENT_WEIGHT_UNITS, ExternalExtras.KG_WEIGHT_UNITS_EXTRA_VALUE);

        /*
        User (doctor) name full name
        Value type: string
        Default value: empty string
         */
        intent.putExtra(ExternalExtras.EXTRA_USER_NAME, "Doctor name");

        /*
        Clinic name
        Value type: string
        Default value: empty string
         */
        intent.putExtra(ExternalExtras.EXTRA_CLINIC, "Clinic");

        /*
        Clinic details (address, phone, email, etc)
        Value type: string
        Default value: empty string
         */
        intent.putExtra(ExternalExtras.EXTRA_CLINIC_DETAILS, "Some clinic details");

        /*
        Patients ID
        Value type: string
        Default value: empty string
         */
        intent.putExtra(ExternalExtras.EXTRA_PATIENT_ID, "1234567890");

        /*
        Patients full name
        Value type: string
        Default value: empty string
         */
        intent.putExtra(ExternalExtras.EXTRA_PATIENT_NAME, "Patient name");

        /*
        Patients contact phone number
        Value type: string
        Default value: empty string
         */
        intent.putExtra(ExternalExtras.EXTRA_PATIENT_PHONE, "+1234567890123");

        /*
        Patients contact email
        Value type: string
        Default value: empty string
         */
        intent.putExtra(ExternalExtras.EXTRA_PATIENT_EMAIL, "patient@mail.com");

        /*
        Patients anamnesis
        Value type: string
        Default value: empty string
         */
        intent.putExtra(ExternalExtras.EXTRA_ANAMNESIS, "Some anamnesis");

        /*
        Patients complaints
        Value type: string
        Default value: empty string
         */
        intent.putExtra(ExternalExtras.EXTRA_COMPLAINTS, "Some complaints");

        /*
        Patients drug therapy
        Value type: string
        Default value: empty string
         */
        intent.putExtra(ExternalExtras.EXTRA_DRUG_THERAPY, "Some drug therapy");
        return intent;
    }

}
