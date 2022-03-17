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

/** 7 */
object FA_7: Icon {
	
	override val name get() = "7"
	
	override val unicode get() = "37"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 320 512"><path d="M315.6 80.14l-224 384c-5.953 10.19-16.66 15.88-27.67 15.88c-5.469 0-11.02-1.406-16.09-4.359c-15.27-8.906-20.42-28.5-11.52-43.77l195.9-335.9H32c-17.67 0-32-14.33-32-32s14.33-32 32-32h256c11.45 0 22.05 6.125 27.75 16.06S321.4 70.23 315.6 80.14z"/></svg>"""
		else -> null
	}
	
}
