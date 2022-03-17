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

object FA_JAR: Icon {
	
	override val name get() = "Jar"
	
	override val unicode get() = "e516"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 320 512"><path d="M32 32C32 14.33 46.33 0 64 0H256C273.7 0 288 14.33 288 32C288 49.67 273.7 64 256 64H64C46.33 64 32 49.67 32 32zM0 160C0 124.7 28.65 96 64 96H256C291.3 96 320 124.7 320 160V448C320 483.3 291.3 512 256 512H64C28.65 512 0 483.3 0 448V160zM256 224H64V384H256V224z"/></svg>"""
		else -> null
	}
	
}
