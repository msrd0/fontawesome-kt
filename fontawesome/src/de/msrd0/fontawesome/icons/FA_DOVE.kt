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

/** Dove */
object FA_DOVE: Icon {
	
	override val name get() = "Dove"
	
	override val unicode get() = "f4ba"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M288 167.2V139.1c-28.25-36.38-47.13-79.29-54.13-125.2C231.7 .4054 214.8-5.02 206.1 5.481C184.1 30.36 168.4 59.7 157.2 92.07C191.4 130.3 237.2 156.7 288 167.2zM400 63.97c-44.25 0-79.1 35.82-79.1 80.08l.0014 59.44c-104.4-6.251-193-70.46-233-161.7C81.48 29.25 63.76 28.58 58.01 40.83C41.38 75.96 32.01 115.2 32.01 156.6c0 70.76 34.11 136.9 85.11 185.9c13.12 12.75 26.13 23.27 38.88 32.77L12.12 411.2c-10.75 2.75-15.5 15.09-9.5 24.47c17.38 26.88 60.42 72.54 153.2 76.29c8 .25 15.99-2.633 22.12-7.883l65.23-56.12l76.84 .0561c88.38 0 160-71.49 160-159.9l.0013-160.2l31.1-63.99L400 63.97zM400 160.1c-8.75 0-16.01-7.259-16.01-16.01c0-8.876 7.261-16.05 16.01-16.05s15.99 7.136 15.99 16.01C416 152.8 408.8 160.1 400 160.1z"/></svg>"""
		else -> null
	}
	
}
