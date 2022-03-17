/* @generated
 *
 * This file is part of the FontAwesome Kotlin library.
 * https://github.com/msrd0/fontawesome-kt
 *
 * This library is not affiliated with FontAwesome. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.msrd0.fontawesome.icons

import de.msrd0.fontawesome.Icon
import de.msrd0.fontawesome.Style
import de.msrd0.fontawesome.Style.SOLID

object FA_BROOM_AND_BALL: Icon {
	
	override val name get() = "Broom and Ball"
	
	override val unicode get() = "f458"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M495.1 351.1c-44.18 0-79.1 35.72-79.1 79.91c0 44.18 35.82 80.09 79.1 80.09s79.1-35.91 79.1-80.09C575.1 387.7 540.2 351.1 495.1 351.1zM242.7 216.4c-30.16 0-102.9 4.15-149.4 41.34c-22 17.5-40.25 55.75-54.63 97.5l60.38-22.12c.7363-.2715 1.46-.3967 2.151-.3967c3.33 0 5.935 2.885 5.935 6.039c0 1.301-.4426 2.647-1.462 3.856L11 454.7C3.75 487.1 0 510.2 0 510.2S27.07 512 64.45 512c65.94 0 163.1-5.499 202.2-35.89c60-47.75 76.63-150.1 76.63-150.1l-86.75-109.2C256.5 216.7 251.4 216.4 242.7 216.4zM607.1 .0074c-6.863 0-13.78 2.192-19.62 6.719L362.7 182.3l-29.88-37.67c-3.248-4.094-7.892-6.058-12.5-6.058c-5.891 0-11.73 3.204-14.54 9.26L283.8 195.1l86.75 109.1l50.88-10.72c7.883-1.66 12.72-8.546 12.72-15.71c0-3.412-1.096-6.886-3.478-9.89l-28.16-35.5l225.2-175.2c8.102-6.312 12.35-15.75 12.35-25.29C640 14.94 626.3 .0074 607.1 .0074z"/></svg>"""
		else -> null
	}
	
}

val FA_QUIDDITCH = FA_BROOM_AND_BALL

val FA_QUIDDITCH_BROOM_BALL = FA_BROOM_AND_BALL
