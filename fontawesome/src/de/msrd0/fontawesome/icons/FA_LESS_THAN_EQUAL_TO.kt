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

object FA_LESS_THAN_EQUAL_TO: Icon {
	
	override val name get() = "Less Than Equal To"
	
	override val unicode get() = "f537"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M54.98 214.2l301.41 119.87c18.39 6.03 38.71-2.54 45.38-19.15l12.09-30.08c6.68-16.61-2.82-34.97-21.21-41l-175.44-68.05 175.56-68.09c18.29-6 27.74-24.27 21.1-40.79l-12.03-29.92c-6.64-16.53-26.86-25.06-45.15-19.06L54.98 137.89C41.21 142.41 32 154.5 32 168.07v15.96c0 13.56 9.21 25.65 22.98 30.17zM424 400H24c-13.25 0-24 10.74-24 24v48c0 13.25 10.75 24 24 24h400c13.25 0 24-10.75 24-24v-48c0-13.26-10.75-24-24-24z"/></svg>"""
		else -> null
	}
	
}
