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

object FA_SOLAR_PANEL: Icon {
	
	override val name get() = "Solar Panel"
	
	override val unicode get() = "f5ba"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M575.4 25.72C572.4 10.78 559.2 0 543.1 0H96c-15.25 0-28.39 10.78-31.38 25.72l-63.1 320c-1.891 9.406 .5469 19.16 6.625 26.56S22.41 384 32 384h255.1v64.25H239.8c-26.26 0-47.75 21.49-47.75 47.75c0 8.844 7.168 16.01 16.01 16l223.1-.1667c8.828-.0098 15.99-7.17 15.99-16C447.1 469.5 426.6 448 400.2 448h-48.28v-64h256c9.594 0 18.67-4.312 24.75-11.72s8.516-17.16 6.625-26.56L575.4 25.72zM517.8 64l19.2 96h-97.98L429.2 64H517.8zM380.1 64l9.617 96H250l9.873-96H380.1zM210.8 64L201 160H103.1l19.18-96H210.8zM71.16 320l22.28-112h102.7L184.6 320H71.16zM233.8 320l11.37-112h149.7L406.2 320H233.8zM455.4 320l-11.5-112h102.7l22.28 112H455.4z"/></svg>"""
		else -> null
	}
	
}
