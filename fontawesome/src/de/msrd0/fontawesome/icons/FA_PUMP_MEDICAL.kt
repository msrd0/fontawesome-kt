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

object FA_PUMP_MEDICAL: Icon {
	
	override val name get() = "Pump Medical"
	
	override val unicode get() = "e06a"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M235.51,159.82H84.24A64,64,0,0,0,20.51,218L.14,442a64,64,0,0,0,63.74,69.8h192A64,64,0,0,0,319.61,442L299.24,218A64,64,0,0,0,235.51,159.82Zm4.37,173.33a13.35,13.35,0,0,1-13.34,13.34h-40v40a13.33,13.33,0,0,1-13.33,13.33H146.54a13.33,13.33,0,0,1-13.33-13.33v-40h-40a13.34,13.34,0,0,1-13.33-13.34V306.49a13.33,13.33,0,0,1,13.33-13.34h40v-40a13.33,13.33,0,0,1,13.33-13.33h26.67a13.33,13.33,0,0,1,13.33,13.33v40h40a13.34,13.34,0,0,1,13.34,13.34ZM379.19,93.88,335.87,50.56a64,64,0,0,0-45.24-18.74H223.88a32,32,0,0,0-32-32h-64a32,32,0,0,0-32,32v96h128v-32h66.75l43.31,43.31a16,16,0,0,0,22.63,0l22.62-22.62A16,16,0,0,0,379.19,93.88Z"/></svg>"""
		else -> null
	}
	
}
