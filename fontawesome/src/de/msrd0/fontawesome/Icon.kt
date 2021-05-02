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
package de.msrd0.fontawesome

/**
 * This interface is implemented for every FontAwesome icon. 
 */
interface Icon {
	/**
	 * The name of this icon.
	 */
	val name: String
	
	/**
	 * The 4-digit hex unicode of the icon.
	 */
	val unicode: String
	
	/**
	 * The styles this icon is available in.
	 */
	val styles: Set<Style>
	
	/**
	 * Return the SVG of this icon, or `null` if no SVG is available.
	 */
	fun svg(style: Style) : String?
}
